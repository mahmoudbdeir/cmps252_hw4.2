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

@Tag("5")
class Record_390 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 390: FirstName is Patricia")
	void FirstNameOfRecord390() {
		assertEquals("Patricia", customers.get(389).getFirstName());
	}

	@Test
	@DisplayName("Record 390: LastName is Gesselli")
	void LastNameOfRecord390() {
		assertEquals("Gesselli", customers.get(389).getLastName());
	}

	@Test
	@DisplayName("Record 390: Company is Pecks Products Co")
	void CompanyOfRecord390() {
		assertEquals("Pecks Products Co", customers.get(389).getCompany());
	}

	@Test
	@DisplayName("Record 390: Address is 7108 S Alton Way  #-m")
	void AddressOfRecord390() {
		assertEquals("7108 S Alton Way  #-m", customers.get(389).getAddress());
	}

	@Test
	@DisplayName("Record 390: City is Englewood")
	void CityOfRecord390() {
		assertEquals("Englewood", customers.get(389).getCity());
	}

	@Test
	@DisplayName("Record 390: County is Arapahoe")
	void CountyOfRecord390() {
		assertEquals("Arapahoe", customers.get(389).getCounty());
	}

	@Test
	@DisplayName("Record 390: State is CO")
	void StateOfRecord390() {
		assertEquals("CO", customers.get(389).getState());
	}

	@Test
	@DisplayName("Record 390: ZIP is 80112")
	void ZIPOfRecord390() {
		assertEquals("80112", customers.get(389).getZIP());
	}

	@Test
	@DisplayName("Record 390: Phone is 303-779-0104")
	void PhoneOfRecord390() {
		assertEquals("303-779-0104", customers.get(389).getPhone());
	}

	@Test
	@DisplayName("Record 390: Fax is 303-779-2609")
	void FaxOfRecord390() {
		assertEquals("303-779-2609", customers.get(389).getFax());
	}

	@Test
	@DisplayName("Record 390: Email is patricia@gesselli.com")
	void EmailOfRecord390() {
		assertEquals("patricia@gesselli.com", customers.get(389).getEmail());
	}

	@Test
	@DisplayName("Record 390: Web is http://www.patriciagesselli.com")
	void WebOfRecord390() {
		assertEquals("http://www.patriciagesselli.com", customers.get(389).getWeb());
	}
}
