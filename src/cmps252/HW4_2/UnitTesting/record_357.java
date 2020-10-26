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

@Tag("37")
class Record_357 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 357: FirstName is Franklyn")
	void FirstNameOfRecord357() {
		assertEquals("Franklyn", customers.get(356).getFirstName());
	}

	@Test
	@DisplayName("Record 357: LastName is Tucek")
	void LastNameOfRecord357() {
		assertEquals("Tucek", customers.get(356).getLastName());
	}

	@Test
	@DisplayName("Record 357: Company is Stafford & Associates Inc")
	void CompanyOfRecord357() {
		assertEquals("Stafford & Associates Inc", customers.get(356).getCompany());
	}

	@Test
	@DisplayName("Record 357: Address is 1295 Greg St")
	void AddressOfRecord357() {
		assertEquals("1295 Greg St", customers.get(356).getAddress());
	}

	@Test
	@DisplayName("Record 357: City is Sparks")
	void CityOfRecord357() {
		assertEquals("Sparks", customers.get(356).getCity());
	}

	@Test
	@DisplayName("Record 357: County is Washoe")
	void CountyOfRecord357() {
		assertEquals("Washoe", customers.get(356).getCounty());
	}

	@Test
	@DisplayName("Record 357: State is NV")
	void StateOfRecord357() {
		assertEquals("NV", customers.get(356).getState());
	}

	@Test
	@DisplayName("Record 357: ZIP is 89431")
	void ZIPOfRecord357() {
		assertEquals("89431", customers.get(356).getZIP());
	}

	@Test
	@DisplayName("Record 357: Phone is 775-331-4024")
	void PhoneOfRecord357() {
		assertEquals("775-331-4024", customers.get(356).getPhone());
	}

	@Test
	@DisplayName("Record 357: Fax is 775-331-7651")
	void FaxOfRecord357() {
		assertEquals("775-331-7651", customers.get(356).getFax());
	}

	@Test
	@DisplayName("Record 357: Email is franklyn@tucek.com")
	void EmailOfRecord357() {
		assertEquals("franklyn@tucek.com", customers.get(356).getEmail());
	}

	@Test
	@DisplayName("Record 357: Web is http://www.franklyntucek.com")
	void WebOfRecord357() {
		assertEquals("http://www.franklyntucek.com", customers.get(356).getWeb());
	}
}
