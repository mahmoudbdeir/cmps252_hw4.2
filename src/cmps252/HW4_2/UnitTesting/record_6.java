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

@Tag("38")
class Record_6 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 6: FirstName is Shirley")
	void FirstNameOfRecord6() {
		assertEquals("Shirley", customers.get(5).getFirstName());
	}

	@Test
	@DisplayName("Record 6: LastName is Keams")
	void LastNameOfRecord6() {
		assertEquals("Keams", customers.get(5).getLastName());
	}

	@Test
	@DisplayName("Record 6: Company is Transport Workers Un Afl Cio")
	void CompanyOfRecord6() {
		assertEquals("Transport Workers Un Afl Cio", customers.get(5).getCompany());
	}

	@Test
	@DisplayName("Record 6: Address is 8 N Water St")
	void AddressOfRecord6() {
		assertEquals("8 N Water St", customers.get(5).getAddress());
	}

	@Test
	@DisplayName("Record 6: City is Nantucket")
	void CityOfRecord6() {
		assertEquals("Nantucket", customers.get(5).getCity());
	}

	@Test
	@DisplayName("Record 6: County is Nantucket")
	void CountyOfRecord6() {
		assertEquals("Nantucket", customers.get(5).getCounty());
	}

	@Test
	@DisplayName("Record 6: State is MA")
	void StateOfRecord6() {
		assertEquals("MA", customers.get(5).getState());
	}

	@Test
	@DisplayName("Record 6: ZIP is 2554")
	void ZIPOfRecord6() {
		assertEquals("2554", customers.get(5).getZIP());
	}

	@Test
	@DisplayName("Record 6: Phone is 508-228-6114")
	void PhoneOfRecord6() {
		assertEquals("508-228-6114", customers.get(5).getPhone());
	}

	@Test
	@DisplayName("Record 6: Fax is 508-228-3052")
	void FaxOfRecord6() {
		assertEquals("508-228-3052", customers.get(5).getFax());
	}

	@Test
	@DisplayName("Record 6: Email is shirley@keams.com")
	void EmailOfRecord6() {
		assertEquals("shirley@keams.com", customers.get(5).getEmail());
	}

	@Test
	@DisplayName("Record 6: Web is http://www.shirleykeams.com")
	void WebOfRecord6() {
		assertEquals("http://www.shirleykeams.com", customers.get(5).getWeb());
	}
}
