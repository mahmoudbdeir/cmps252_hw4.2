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

@Tag("27")
class Record_3823 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3823: FirstName is Daren")
	void FirstNameOfRecord3823() {
		assertEquals("Daren", customers.get(3822).getFirstName());
	}

	@Test
	@DisplayName("Record 3823: LastName is Plosker")
	void LastNameOfRecord3823() {
		assertEquals("Plosker", customers.get(3822).getLastName());
	}

	@Test
	@DisplayName("Record 3823: Company is Meba Pnsn Medl & Vacation")
	void CompanyOfRecord3823() {
		assertEquals("Meba Pnsn Medl & Vacation", customers.get(3822).getCompany());
	}

	@Test
	@DisplayName("Record 3823: Address is 845 Canal St")
	void AddressOfRecord3823() {
		assertEquals("845 Canal St", customers.get(3822).getAddress());
	}

	@Test
	@DisplayName("Record 3823: City is Stamford")
	void CityOfRecord3823() {
		assertEquals("Stamford", customers.get(3822).getCity());
	}

	@Test
	@DisplayName("Record 3823: County is Fairfield")
	void CountyOfRecord3823() {
		assertEquals("Fairfield", customers.get(3822).getCounty());
	}

	@Test
	@DisplayName("Record 3823: State is CT")
	void StateOfRecord3823() {
		assertEquals("CT", customers.get(3822).getState());
	}

	@Test
	@DisplayName("Record 3823: ZIP is 6902")
	void ZIPOfRecord3823() {
		assertEquals("6902", customers.get(3822).getZIP());
	}

	@Test
	@DisplayName("Record 3823: Phone is 203-325-3730")
	void PhoneOfRecord3823() {
		assertEquals("203-325-3730", customers.get(3822).getPhone());
	}

	@Test
	@DisplayName("Record 3823: Fax is 203-325-7557")
	void FaxOfRecord3823() {
		assertEquals("203-325-7557", customers.get(3822).getFax());
	}

	@Test
	@DisplayName("Record 3823: Email is daren@plosker.com")
	void EmailOfRecord3823() {
		assertEquals("daren@plosker.com", customers.get(3822).getEmail());
	}

	@Test
	@DisplayName("Record 3823: Web is http://www.darenplosker.com")
	void WebOfRecord3823() {
		assertEquals("http://www.darenplosker.com", customers.get(3822).getWeb());
	}
}
