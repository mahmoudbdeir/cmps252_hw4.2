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

@Tag("21")
class Record_2430 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2430: FirstName is Reginald")
	void FirstNameOfRecord2430() {
		assertEquals("Reginald", customers.get(2429).getFirstName());
	}

	@Test
	@DisplayName("Record 2430: LastName is Boening")
	void LastNameOfRecord2430() {
		assertEquals("Boening", customers.get(2429).getLastName());
	}

	@Test
	@DisplayName("Record 2430: Company is Amalgamated Transit Un Intrntl")
	void CompanyOfRecord2430() {
		assertEquals("Amalgamated Transit Un Intrntl", customers.get(2429).getCompany());
	}

	@Test
	@DisplayName("Record 2430: Address is 3069 Waterloo Rd")
	void AddressOfRecord2430() {
		assertEquals("3069 Waterloo Rd", customers.get(2429).getAddress());
	}

	@Test
	@DisplayName("Record 2430: City is Stockton")
	void CityOfRecord2430() {
		assertEquals("Stockton", customers.get(2429).getCity());
	}

	@Test
	@DisplayName("Record 2430: County is San Joaquin")
	void CountyOfRecord2430() {
		assertEquals("San Joaquin", customers.get(2429).getCounty());
	}

	@Test
	@DisplayName("Record 2430: State is CA")
	void StateOfRecord2430() {
		assertEquals("CA", customers.get(2429).getState());
	}

	@Test
	@DisplayName("Record 2430: ZIP is 95205")
	void ZIPOfRecord2430() {
		assertEquals("95205", customers.get(2429).getZIP());
	}

	@Test
	@DisplayName("Record 2430: Phone is 209-462-8441")
	void PhoneOfRecord2430() {
		assertEquals("209-462-8441", customers.get(2429).getPhone());
	}

	@Test
	@DisplayName("Record 2430: Fax is 209-462-5647")
	void FaxOfRecord2430() {
		assertEquals("209-462-5647", customers.get(2429).getFax());
	}

	@Test
	@DisplayName("Record 2430: Email is reginald@boening.com")
	void EmailOfRecord2430() {
		assertEquals("reginald@boening.com", customers.get(2429).getEmail());
	}

	@Test
	@DisplayName("Record 2430: Web is http://www.reginaldboening.com")
	void WebOfRecord2430() {
		assertEquals("http://www.reginaldboening.com", customers.get(2429).getWeb());
	}
}
