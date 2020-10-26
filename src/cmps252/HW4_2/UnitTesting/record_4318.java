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

@Tag("7")
class Record_4318 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4318: FirstName is Genaro")
	void FirstNameOfRecord4318() {
		assertEquals("Genaro", customers.get(4317).getFirstName());
	}

	@Test
	@DisplayName("Record 4318: LastName is Janis")
	void LastNameOfRecord4318() {
		assertEquals("Janis", customers.get(4317).getLastName());
	}

	@Test
	@DisplayName("Record 4318: Company is Rome Machine & Foundry Co")
	void CompanyOfRecord4318() {
		assertEquals("Rome Machine & Foundry Co", customers.get(4317).getCompany());
	}

	@Test
	@DisplayName("Record 4318: Address is 35 W Union Ave")
	void AddressOfRecord4318() {
		assertEquals("35 W Union Ave", customers.get(4317).getAddress());
	}

	@Test
	@DisplayName("Record 4318: City is Bound Brook")
	void CityOfRecord4318() {
		assertEquals("Bound Brook", customers.get(4317).getCity());
	}

	@Test
	@DisplayName("Record 4318: County is Somerset")
	void CountyOfRecord4318() {
		assertEquals("Somerset", customers.get(4317).getCounty());
	}

	@Test
	@DisplayName("Record 4318: State is NJ")
	void StateOfRecord4318() {
		assertEquals("NJ", customers.get(4317).getState());
	}

	@Test
	@DisplayName("Record 4318: ZIP is 8805")
	void ZIPOfRecord4318() {
		assertEquals("8805", customers.get(4317).getZIP());
	}

	@Test
	@DisplayName("Record 4318: Phone is 732-805-1707")
	void PhoneOfRecord4318() {
		assertEquals("732-805-1707", customers.get(4317).getPhone());
	}

	@Test
	@DisplayName("Record 4318: Fax is 732-805-8494")
	void FaxOfRecord4318() {
		assertEquals("732-805-8494", customers.get(4317).getFax());
	}

	@Test
	@DisplayName("Record 4318: Email is genaro@janis.com")
	void EmailOfRecord4318() {
		assertEquals("genaro@janis.com", customers.get(4317).getEmail());
	}

	@Test
	@DisplayName("Record 4318: Web is http://www.genarojanis.com")
	void WebOfRecord4318() {
		assertEquals("http://www.genarojanis.com", customers.get(4317).getWeb());
	}
}
