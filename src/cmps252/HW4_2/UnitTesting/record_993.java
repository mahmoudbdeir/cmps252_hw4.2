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

@Tag("38")
class Record_993 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 993: FirstName is Brain")
	void FirstNameOfRecord993() {
		assertEquals("Brain", customers.get(992).getFirstName());
	}

	@Test
	@DisplayName("Record 993: LastName is Grazier")
	void LastNameOfRecord993() {
		assertEquals("Grazier", customers.get(992).getLastName());
	}

	@Test
	@DisplayName("Record 993: Company is Sun Maid Raisin Growers Of Ca")
	void CompanyOfRecord993() {
		assertEquals("Sun Maid Raisin Growers Of Ca", customers.get(992).getCompany());
	}

	@Test
	@DisplayName("Record 993: Address is 99128 Aiea Hyghts Dr  #-202")
	void AddressOfRecord993() {
		assertEquals("99128 Aiea Hyghts Dr  #-202", customers.get(992).getAddress());
	}

	@Test
	@DisplayName("Record 993: City is Aiea")
	void CityOfRecord993() {
		assertEquals("Aiea", customers.get(992).getCity());
	}

	@Test
	@DisplayName("Record 993: County is Honolulu")
	void CountyOfRecord993() {
		assertEquals("Honolulu", customers.get(992).getCounty());
	}

	@Test
	@DisplayName("Record 993: State is HI")
	void StateOfRecord993() {
		assertEquals("HI", customers.get(992).getState());
	}

	@Test
	@DisplayName("Record 993: ZIP is 96701")
	void ZIPOfRecord993() {
		assertEquals("96701", customers.get(992).getZIP());
	}

	@Test
	@DisplayName("Record 993: Phone is 808-486-6917")
	void PhoneOfRecord993() {
		assertEquals("808-486-6917", customers.get(992).getPhone());
	}

	@Test
	@DisplayName("Record 993: Fax is 808-486-9347")
	void FaxOfRecord993() {
		assertEquals("808-486-9347", customers.get(992).getFax());
	}

	@Test
	@DisplayName("Record 993: Email is brain@grazier.com")
	void EmailOfRecord993() {
		assertEquals("brain@grazier.com", customers.get(992).getEmail());
	}

	@Test
	@DisplayName("Record 993: Web is http://www.braingrazier.com")
	void WebOfRecord993() {
		assertEquals("http://www.braingrazier.com", customers.get(992).getWeb());
	}
}
