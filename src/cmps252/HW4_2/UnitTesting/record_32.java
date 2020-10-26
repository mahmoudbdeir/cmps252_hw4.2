package cmps252.HW4_2.UnitTesting;

import static org.junit.jupiter.api.Assertions.*;
import java.io.FileNotFoundException;
import java.util.List;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import cmps252.HW4_2.Customer;
import cmps252.HW4_2.FileParser;

@Tag("41")
class Record_32 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 32: FirstName is Abdul")
	void FirstNameOfRecord32() {
		assertEquals("Abdul", customers.get(31).getFirstName());
	}

	@Test
	@DisplayName("Record 32: LastName is Begum")
	void LastNameOfRecord32() {
		assertEquals("Begum", customers.get(31).getLastName());
	}

	@Test
	@DisplayName("Record 32: Company is Hisrich, Thomas H Esq")
	void CompanyOfRecord32() {
		assertEquals("Hisrich, Thomas H Esq", customers.get(31).getCompany());
	}

	@Test
	@DisplayName("Record 32: Address is 224 3rd Ave")
	void AddressOfRecord32() {
		assertEquals("224 3rd Ave", customers.get(31).getAddress());
	}

	@Test
	@DisplayName("Record 32: City is Brooklyn")
	void CityOfRecord32() {
		assertEquals("Brooklyn", customers.get(31).getCity());
	}

	@Test
	@DisplayName("Record 32: County is Kings")
	void CountyOfRecord32() {
		assertEquals("Kings", customers.get(31).getCounty());
	}

	@Test
	@DisplayName("Record 32: State is NY")
	void StateOfRecord32() {
		assertEquals("NY", customers.get(31).getState());
	}

	@Test
	@DisplayName("Record 32: ZIP is 11217")
	void ZIPOfRecord32() {
		assertEquals("11217", customers.get(31).getZIP());
	}

	@Test
	@DisplayName("Record 32: Phone is 718-522-7615")
	void PhoneOfRecord32() {
		assertEquals("718-522-7615", customers.get(31).getPhone());
	}

	@Test
	@DisplayName("Record 32: Fax is 718-522-8418")
	void FaxOfRecord32() {
		assertEquals("718-522-8418", customers.get(31).getFax());
	}

	@Test
	@DisplayName("Record 32: Email is abdul@begum.com")
	void EmailOfRecord32() {
		assertEquals("abdul@begum.com", customers.get(31).getEmail());
	}

	@Test
	@DisplayName("Record 32: Web is http://www.abdulbegum.com")
	void WebOfRecord32() {
		assertEquals("http://www.abdulbegum.com", customers.get(31).getWeb());
	}
}
