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

@Tag("41")
class Record_3489 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3489: FirstName is Corine")
	void FirstNameOfRecord3489() {
		assertEquals("Corine", customers.get(3488).getFirstName());
	}

	@Test
	@DisplayName("Record 3489: LastName is Hemeon")
	void LastNameOfRecord3489() {
		assertEquals("Hemeon", customers.get(3488).getLastName());
	}

	@Test
	@DisplayName("Record 3489: Company is Lanum Metal Products Co Inc")
	void CompanyOfRecord3489() {
		assertEquals("Lanum Metal Products Co Inc", customers.get(3488).getCompany());
	}

	@Test
	@DisplayName("Record 3489: Address is 608 Jericho Tpke")
	void AddressOfRecord3489() {
		assertEquals("608 Jericho Tpke", customers.get(3488).getAddress());
	}

	@Test
	@DisplayName("Record 3489: City is New Hyde Park")
	void CityOfRecord3489() {
		assertEquals("New Hyde Park", customers.get(3488).getCity());
	}

	@Test
	@DisplayName("Record 3489: County is Nassau")
	void CountyOfRecord3489() {
		assertEquals("Nassau", customers.get(3488).getCounty());
	}

	@Test
	@DisplayName("Record 3489: State is NY")
	void StateOfRecord3489() {
		assertEquals("NY", customers.get(3488).getState());
	}

	@Test
	@DisplayName("Record 3489: ZIP is 11040")
	void ZIPOfRecord3489() {
		assertEquals("11040", customers.get(3488).getZIP());
	}

	@Test
	@DisplayName("Record 3489: Phone is 516-328-5192")
	void PhoneOfRecord3489() {
		assertEquals("516-328-5192", customers.get(3488).getPhone());
	}

	@Test
	@DisplayName("Record 3489: Fax is 516-328-1482")
	void FaxOfRecord3489() {
		assertEquals("516-328-1482", customers.get(3488).getFax());
	}

	@Test
	@DisplayName("Record 3489: Email is corine@hemeon.com")
	void EmailOfRecord3489() {
		assertEquals("corine@hemeon.com", customers.get(3488).getEmail());
	}

	@Test
	@DisplayName("Record 3489: Web is http://www.corinehemeon.com")
	void WebOfRecord3489() {
		assertEquals("http://www.corinehemeon.com", customers.get(3488).getWeb());
	}
}
