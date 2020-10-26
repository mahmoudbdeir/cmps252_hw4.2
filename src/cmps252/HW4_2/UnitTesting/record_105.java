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

@Tag("12")
class Record_105 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 105: FirstName is Douglass")
	void FirstNameOfRecord105() {
		assertEquals("Douglass", customers.get(104).getFirstName());
	}

	@Test
	@DisplayName("Record 105: LastName is Saison")
	void LastNameOfRecord105() {
		assertEquals("Saison", customers.get(104).getLastName());
	}

	@Test
	@DisplayName("Record 105: Company is Miller Chiropractic Center")
	void CompanyOfRecord105() {
		assertEquals("Miller Chiropractic Center", customers.get(104).getCompany());
	}

	@Test
	@DisplayName("Record 105: Address is 174 Sanford Ln")
	void AddressOfRecord105() {
		assertEquals("174 Sanford Ln", customers.get(104).getAddress());
	}

	@Test
	@DisplayName("Record 105: City is Stamford")
	void CityOfRecord105() {
		assertEquals("Stamford", customers.get(104).getCity());
	}

	@Test
	@DisplayName("Record 105: County is Fairfield")
	void CountyOfRecord105() {
		assertEquals("Fairfield", customers.get(104).getCounty());
	}

	@Test
	@DisplayName("Record 105: State is CT")
	void StateOfRecord105() {
		assertEquals("CT", customers.get(104).getState());
	}

	@Test
	@DisplayName("Record 105: ZIP is 6905")
	void ZIPOfRecord105() {
		assertEquals("6905", customers.get(104).getZIP());
	}

	@Test
	@DisplayName("Record 105: Phone is 203-322-7001")
	void PhoneOfRecord105() {
		assertEquals("203-322-7001", customers.get(104).getPhone());
	}

	@Test
	@DisplayName("Record 105: Fax is 203-322-2991")
	void FaxOfRecord105() {
		assertEquals("203-322-2991", customers.get(104).getFax());
	}

	@Test
	@DisplayName("Record 105: Email is douglass@saison.com")
	void EmailOfRecord105() {
		assertEquals("douglass@saison.com", customers.get(104).getEmail());
	}

	@Test
	@DisplayName("Record 105: Web is http://www.douglasssaison.com")
	void WebOfRecord105() {
		assertEquals("http://www.douglasssaison.com", customers.get(104).getWeb());
	}
}
