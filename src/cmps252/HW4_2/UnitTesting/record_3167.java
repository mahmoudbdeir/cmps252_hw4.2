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

@Tag("11")
class Record_3167 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3167: FirstName is Madelyne")
	void FirstNameOfRecord3167() {
		assertEquals("Madelyne", customers.get(3166).getFirstName());
	}

	@Test
	@DisplayName("Record 3167: LastName is Fugueroa")
	void LastNameOfRecord3167() {
		assertEquals("Fugueroa", customers.get(3166).getLastName());
	}

	@Test
	@DisplayName("Record 3167: Company is Hldy Inn Genesee Plz Cnvntn")
	void CompanyOfRecord3167() {
		assertEquals("Hldy Inn Genesee Plz Cnvntn", customers.get(3166).getCompany());
	}

	@Test
	@DisplayName("Record 3167: Address is 200 Golden Bay Blvd")
	void AddressOfRecord3167() {
		assertEquals("200 Golden Bay Blvd", customers.get(3166).getAddress());
	}

	@Test
	@DisplayName("Record 3167: City is Oak Hill")
	void CityOfRecord3167() {
		assertEquals("Oak Hill", customers.get(3166).getCity());
	}

	@Test
	@DisplayName("Record 3167: County is Volusia")
	void CountyOfRecord3167() {
		assertEquals("Volusia", customers.get(3166).getCounty());
	}

	@Test
	@DisplayName("Record 3167: State is FL")
	void StateOfRecord3167() {
		assertEquals("FL", customers.get(3166).getState());
	}

	@Test
	@DisplayName("Record 3167: ZIP is 32759")
	void ZIPOfRecord3167() {
		assertEquals("32759", customers.get(3166).getZIP());
	}

	@Test
	@DisplayName("Record 3167: Phone is 386-345-7550")
	void PhoneOfRecord3167() {
		assertEquals("386-345-7550", customers.get(3166).getPhone());
	}

	@Test
	@DisplayName("Record 3167: Fax is 386-345-5066")
	void FaxOfRecord3167() {
		assertEquals("386-345-5066", customers.get(3166).getFax());
	}

	@Test
	@DisplayName("Record 3167: Email is madelyne@fugueroa.com")
	void EmailOfRecord3167() {
		assertEquals("madelyne@fugueroa.com", customers.get(3166).getEmail());
	}

	@Test
	@DisplayName("Record 3167: Web is http://www.madelynefugueroa.com")
	void WebOfRecord3167() {
		assertEquals("http://www.madelynefugueroa.com", customers.get(3166).getWeb());
	}
}
