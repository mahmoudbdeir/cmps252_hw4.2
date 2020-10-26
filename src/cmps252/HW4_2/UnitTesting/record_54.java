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

@Tag("47")
class Record_54 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 54: FirstName is Jackie")
	void FirstNameOfRecord54() {
		assertEquals("Jackie", customers.get(53).getFirstName());
	}

	@Test
	@DisplayName("Record 54: LastName is Fabel")
	void LastNameOfRecord54() {
		assertEquals("Fabel", customers.get(53).getLastName());
	}

	@Test
	@DisplayName("Record 54: Company is Cabak Randall Jasper Griffiths")
	void CompanyOfRecord54() {
		assertEquals("Cabak Randall Jasper Griffiths", customers.get(53).getCompany());
	}

	@Test
	@DisplayName("Record 54: Address is 99 Cobb St")
	void AddressOfRecord54() {
		assertEquals("99 Cobb St", customers.get(53).getAddress());
	}

	@Test
	@DisplayName("Record 54: City is Rockaway")
	void CityOfRecord54() {
		assertEquals("Rockaway", customers.get(53).getCity());
	}

	@Test
	@DisplayName("Record 54: County is Morris")
	void CountyOfRecord54() {
		assertEquals("Morris", customers.get(53).getCounty());
	}

	@Test
	@DisplayName("Record 54: State is NJ")
	void StateOfRecord54() {
		assertEquals("NJ", customers.get(53).getState());
	}

	@Test
	@DisplayName("Record 54: ZIP is 7866")
	void ZIPOfRecord54() {
		assertEquals("7866", customers.get(53).getZIP());
	}

	@Test
	@DisplayName("Record 54: Phone is 973-627-3840")
	void PhoneOfRecord54() {
		assertEquals("973-627-3840", customers.get(53).getPhone());
	}

	@Test
	@DisplayName("Record 54: Fax is 973-627-2359")
	void FaxOfRecord54() {
		assertEquals("973-627-2359", customers.get(53).getFax());
	}

	@Test
	@DisplayName("Record 54: Email is jackie@fabel.com")
	void EmailOfRecord54() {
		assertEquals("jackie@fabel.com", customers.get(53).getEmail());
	}

	@Test
	@DisplayName("Record 54: Web is http://www.jackiefabel.com")
	void WebOfRecord54() {
		assertEquals("http://www.jackiefabel.com", customers.get(53).getWeb());
	}
}
