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

@Tag("30")
class Record_1030 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1030: FirstName is Marcus")
	void FirstNameOfRecord1030() {
		assertEquals("Marcus", customers.get(1029).getFirstName());
	}

	@Test
	@DisplayName("Record 1030: LastName is Dragg")
	void LastNameOfRecord1030() {
		assertEquals("Dragg", customers.get(1029).getLastName());
	}

	@Test
	@DisplayName("Record 1030: Company is Best Western Kingsville Inn")
	void CompanyOfRecord1030() {
		assertEquals("Best Western Kingsville Inn", customers.get(1029).getCompany());
	}

	@Test
	@DisplayName("Record 1030: Address is 5 Liberty Ct")
	void AddressOfRecord1030() {
		assertEquals("5 Liberty Ct", customers.get(1029).getAddress());
	}

	@Test
	@DisplayName("Record 1030: City is Bolingbrook")
	void CityOfRecord1030() {
		assertEquals("Bolingbrook", customers.get(1029).getCity());
	}

	@Test
	@DisplayName("Record 1030: County is Will")
	void CountyOfRecord1030() {
		assertEquals("Will", customers.get(1029).getCounty());
	}

	@Test
	@DisplayName("Record 1030: State is IL")
	void StateOfRecord1030() {
		assertEquals("IL", customers.get(1029).getState());
	}

	@Test
	@DisplayName("Record 1030: ZIP is 60440")
	void ZIPOfRecord1030() {
		assertEquals("60440", customers.get(1029).getZIP());
	}

	@Test
	@DisplayName("Record 1030: Phone is 630-739-4433")
	void PhoneOfRecord1030() {
		assertEquals("630-739-4433", customers.get(1029).getPhone());
	}

	@Test
	@DisplayName("Record 1030: Fax is 630-739-8997")
	void FaxOfRecord1030() {
		assertEquals("630-739-8997", customers.get(1029).getFax());
	}

	@Test
	@DisplayName("Record 1030: Email is marcus@dragg.com")
	void EmailOfRecord1030() {
		assertEquals("marcus@dragg.com", customers.get(1029).getEmail());
	}

	@Test
	@DisplayName("Record 1030: Web is http://www.marcusdragg.com")
	void WebOfRecord1030() {
		assertEquals("http://www.marcusdragg.com", customers.get(1029).getWeb());
	}
}
