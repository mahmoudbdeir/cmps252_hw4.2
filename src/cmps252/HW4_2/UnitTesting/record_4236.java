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

@Tag("3")
class Record_4236 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4236: FirstName is Oralia")
	void FirstNameOfRecord4236() {
		assertEquals("Oralia", customers.get(4235).getFirstName());
	}

	@Test
	@DisplayName("Record 4236: LastName is Felde")
	void LastNameOfRecord4236() {
		assertEquals("Felde", customers.get(4235).getLastName());
	}

	@Test
	@DisplayName("Record 4236: Company is Lithibar Matik Inc")
	void CompanyOfRecord4236() {
		assertEquals("Lithibar Matik Inc", customers.get(4235).getCompany());
	}

	@Test
	@DisplayName("Record 4236: Address is 1667 State Route 10")
	void AddressOfRecord4236() {
		assertEquals("1667 State Route 10", customers.get(4235).getAddress());
	}

	@Test
	@DisplayName("Record 4236: City is Morris Plains")
	void CityOfRecord4236() {
		assertEquals("Morris Plains", customers.get(4235).getCity());
	}

	@Test
	@DisplayName("Record 4236: County is Morris")
	void CountyOfRecord4236() {
		assertEquals("Morris", customers.get(4235).getCounty());
	}

	@Test
	@DisplayName("Record 4236: State is NJ")
	void StateOfRecord4236() {
		assertEquals("NJ", customers.get(4235).getState());
	}

	@Test
	@DisplayName("Record 4236: ZIP is 7950")
	void ZIPOfRecord4236() {
		assertEquals("7950", customers.get(4235).getZIP());
	}

	@Test
	@DisplayName("Record 4236: Phone is 973-644-1831")
	void PhoneOfRecord4236() {
		assertEquals("973-644-1831", customers.get(4235).getPhone());
	}

	@Test
	@DisplayName("Record 4236: Fax is 973-644-4828")
	void FaxOfRecord4236() {
		assertEquals("973-644-4828", customers.get(4235).getFax());
	}

	@Test
	@DisplayName("Record 4236: Email is oralia@felde.com")
	void EmailOfRecord4236() {
		assertEquals("oralia@felde.com", customers.get(4235).getEmail());
	}

	@Test
	@DisplayName("Record 4236: Web is http://www.oraliafelde.com")
	void WebOfRecord4236() {
		assertEquals("http://www.oraliafelde.com", customers.get(4235).getWeb());
	}
}
