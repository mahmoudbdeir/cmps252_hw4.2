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

@Tag("43")
class Record_4713 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4713: FirstName is Nicolas")
	void FirstNameOfRecord4713() {
		assertEquals("Nicolas", customers.get(4712).getFirstName());
	}

	@Test
	@DisplayName("Record 4713: LastName is Shrewsberry")
	void LastNameOfRecord4713() {
		assertEquals("Shrewsberry", customers.get(4712).getLastName());
	}

	@Test
	@DisplayName("Record 4713: Company is Construction Products Of Wa")
	void CompanyOfRecord4713() {
		assertEquals("Construction Products Of Wa", customers.get(4712).getCompany());
	}

	@Test
	@DisplayName("Record 4713: Address is 105 W 4th St")
	void AddressOfRecord4713() {
		assertEquals("105 W 4th St", customers.get(4712).getAddress());
	}

	@Test
	@DisplayName("Record 4713: City is Cincinnati")
	void CityOfRecord4713() {
		assertEquals("Cincinnati", customers.get(4712).getCity());
	}

	@Test
	@DisplayName("Record 4713: County is Hamilton")
	void CountyOfRecord4713() {
		assertEquals("Hamilton", customers.get(4712).getCounty());
	}

	@Test
	@DisplayName("Record 4713: State is OH")
	void StateOfRecord4713() {
		assertEquals("OH", customers.get(4712).getState());
	}

	@Test
	@DisplayName("Record 4713: ZIP is 45202")
	void ZIPOfRecord4713() {
		assertEquals("45202", customers.get(4712).getZIP());
	}

	@Test
	@DisplayName("Record 4713: Phone is 513-721-5665")
	void PhoneOfRecord4713() {
		assertEquals("513-721-5665", customers.get(4712).getPhone());
	}

	@Test
	@DisplayName("Record 4713: Fax is 513-721-9012")
	void FaxOfRecord4713() {
		assertEquals("513-721-9012", customers.get(4712).getFax());
	}

	@Test
	@DisplayName("Record 4713: Email is nicolas@shrewsberry.com")
	void EmailOfRecord4713() {
		assertEquals("nicolas@shrewsberry.com", customers.get(4712).getEmail());
	}

	@Test
	@DisplayName("Record 4713: Web is http://www.nicolasshrewsberry.com")
	void WebOfRecord4713() {
		assertEquals("http://www.nicolasshrewsberry.com", customers.get(4712).getWeb());
	}
}
