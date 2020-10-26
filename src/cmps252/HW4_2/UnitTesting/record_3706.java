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

@Tag("33")
class Record_3706 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3706: FirstName is Bonnie")
	void FirstNameOfRecord3706() {
		assertEquals("Bonnie", customers.get(3705).getFirstName());
	}

	@Test
	@DisplayName("Record 3706: LastName is Rim")
	void LastNameOfRecord3706() {
		assertEquals("Rim", customers.get(3705).getLastName());
	}

	@Test
	@DisplayName("Record 3706: Company is Florida Lumber Company")
	void CompanyOfRecord3706() {
		assertEquals("Florida Lumber Company", customers.get(3705).getCompany());
	}

	@Test
	@DisplayName("Record 3706: Address is 1442 Cochise Trl")
	void AddressOfRecord3706() {
		assertEquals("1442 Cochise Trl", customers.get(3705).getAddress());
	}

	@Test
	@DisplayName("Record 3706: City is Tallahassee")
	void CityOfRecord3706() {
		assertEquals("Tallahassee", customers.get(3705).getCity());
	}

	@Test
	@DisplayName("Record 3706: County is Leon")
	void CountyOfRecord3706() {
		assertEquals("Leon", customers.get(3705).getCounty());
	}

	@Test
	@DisplayName("Record 3706: State is FL")
	void StateOfRecord3706() {
		assertEquals("FL", customers.get(3705).getState());
	}

	@Test
	@DisplayName("Record 3706: ZIP is 32304")
	void ZIPOfRecord3706() {
		assertEquals("32304", customers.get(3705).getZIP());
	}

	@Test
	@DisplayName("Record 3706: Phone is 850-576-2039")
	void PhoneOfRecord3706() {
		assertEquals("850-576-2039", customers.get(3705).getPhone());
	}

	@Test
	@DisplayName("Record 3706: Fax is 850-576-5694")
	void FaxOfRecord3706() {
		assertEquals("850-576-5694", customers.get(3705).getFax());
	}

	@Test
	@DisplayName("Record 3706: Email is bonnie@rim.com")
	void EmailOfRecord3706() {
		assertEquals("bonnie@rim.com", customers.get(3705).getEmail());
	}

	@Test
	@DisplayName("Record 3706: Web is http://www.bonnierim.com")
	void WebOfRecord3706() {
		assertEquals("http://www.bonnierim.com", customers.get(3705).getWeb());
	}
}
