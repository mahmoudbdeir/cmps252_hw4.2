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

@Tag("9")
class Record_1743 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1743: FirstName is Alicia")
	void FirstNameOfRecord1743() {
		assertEquals("Alicia", customers.get(1742).getFirstName());
	}

	@Test
	@DisplayName("Record 1743: LastName is Rahall")
	void LastNameOfRecord1743() {
		assertEquals("Rahall", customers.get(1742).getLastName());
	}

	@Test
	@DisplayName("Record 1743: Company is Salisbury, Raymond J Esq")
	void CompanyOfRecord1743() {
		assertEquals("Salisbury, Raymond J Esq", customers.get(1742).getCompany());
	}

	@Test
	@DisplayName("Record 1743: Address is 3000 Minnesota Ave")
	void AddressOfRecord1743() {
		assertEquals("3000 Minnesota Ave", customers.get(1742).getAddress());
	}

	@Test
	@DisplayName("Record 1743: City is Stevens Point")
	void CityOfRecord1743() {
		assertEquals("Stevens Point", customers.get(1742).getCity());
	}

	@Test
	@DisplayName("Record 1743: County is Portage")
	void CountyOfRecord1743() {
		assertEquals("Portage", customers.get(1742).getCounty());
	}

	@Test
	@DisplayName("Record 1743: State is WI")
	void StateOfRecord1743() {
		assertEquals("WI", customers.get(1742).getState());
	}

	@Test
	@DisplayName("Record 1743: ZIP is 54481")
	void ZIPOfRecord1743() {
		assertEquals("54481", customers.get(1742).getZIP());
	}

	@Test
	@DisplayName("Record 1743: Phone is 715-341-3878")
	void PhoneOfRecord1743() {
		assertEquals("715-341-3878", customers.get(1742).getPhone());
	}

	@Test
	@DisplayName("Record 1743: Fax is 715-341-9972")
	void FaxOfRecord1743() {
		assertEquals("715-341-9972", customers.get(1742).getFax());
	}

	@Test
	@DisplayName("Record 1743: Email is alicia@rahall.com")
	void EmailOfRecord1743() {
		assertEquals("alicia@rahall.com", customers.get(1742).getEmail());
	}

	@Test
	@DisplayName("Record 1743: Web is http://www.aliciarahall.com")
	void WebOfRecord1743() {
		assertEquals("http://www.aliciarahall.com", customers.get(1742).getWeb());
	}
}
