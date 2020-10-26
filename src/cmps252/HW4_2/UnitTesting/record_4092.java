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

@Tag("14")
class Record_4092 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4092: FirstName is Adele")
	void FirstNameOfRecord4092() {
		assertEquals("Adele", customers.get(4091).getFirstName());
	}

	@Test
	@DisplayName("Record 4092: LastName is More")
	void LastNameOfRecord4092() {
		assertEquals("More", customers.get(4091).getLastName());
	}

	@Test
	@DisplayName("Record 4092: Company is Superior Cylinder Heads Inc")
	void CompanyOfRecord4092() {
		assertEquals("Superior Cylinder Heads Inc", customers.get(4091).getCompany());
	}

	@Test
	@DisplayName("Record 4092: Address is 17 Sammis Ave")
	void AddressOfRecord4092() {
		assertEquals("17 Sammis Ave", customers.get(4091).getAddress());
	}

	@Test
	@DisplayName("Record 4092: City is Dover")
	void CityOfRecord4092() {
		assertEquals("Dover", customers.get(4091).getCity());
	}

	@Test
	@DisplayName("Record 4092: County is Morris")
	void CountyOfRecord4092() {
		assertEquals("Morris", customers.get(4091).getCounty());
	}

	@Test
	@DisplayName("Record 4092: State is NJ")
	void StateOfRecord4092() {
		assertEquals("NJ", customers.get(4091).getState());
	}

	@Test
	@DisplayName("Record 4092: ZIP is 7801")
	void ZIPOfRecord4092() {
		assertEquals("7801", customers.get(4091).getZIP());
	}

	@Test
	@DisplayName("Record 4092: Phone is 973-989-4797")
	void PhoneOfRecord4092() {
		assertEquals("973-989-4797", customers.get(4091).getPhone());
	}

	@Test
	@DisplayName("Record 4092: Fax is 973-989-4864")
	void FaxOfRecord4092() {
		assertEquals("973-989-4864", customers.get(4091).getFax());
	}

	@Test
	@DisplayName("Record 4092: Email is adele@more.com")
	void EmailOfRecord4092() {
		assertEquals("adele@more.com", customers.get(4091).getEmail());
	}

	@Test
	@DisplayName("Record 4092: Web is http://www.adelemore.com")
	void WebOfRecord4092() {
		assertEquals("http://www.adelemore.com", customers.get(4091).getWeb());
	}
}
