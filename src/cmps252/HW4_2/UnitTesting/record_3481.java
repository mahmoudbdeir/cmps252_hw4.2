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

@Tag("40")
class Record_3481 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3481: FirstName is Winford")
	void FirstNameOfRecord3481() {
		assertEquals("Winford", customers.get(3480).getFirstName());
	}

	@Test
	@DisplayName("Record 3481: LastName is Olecki")
	void LastNameOfRecord3481() {
		assertEquals("Olecki", customers.get(3480).getLastName());
	}

	@Test
	@DisplayName("Record 3481: Company is Freeman, Gary M Md")
	void CompanyOfRecord3481() {
		assertEquals("Freeman, Gary M Md", customers.get(3480).getCompany());
	}

	@Test
	@DisplayName("Record 3481: Address is 220 Montgomery St  #-409")
	void AddressOfRecord3481() {
		assertEquals("220 Montgomery St  #-409", customers.get(3480).getAddress());
	}

	@Test
	@DisplayName("Record 3481: City is San Francisco")
	void CityOfRecord3481() {
		assertEquals("San Francisco", customers.get(3480).getCity());
	}

	@Test
	@DisplayName("Record 3481: County is San Francisco")
	void CountyOfRecord3481() {
		assertEquals("San Francisco", customers.get(3480).getCounty());
	}

	@Test
	@DisplayName("Record 3481: State is CA")
	void StateOfRecord3481() {
		assertEquals("CA", customers.get(3480).getState());
	}

	@Test
	@DisplayName("Record 3481: ZIP is 94104")
	void ZIPOfRecord3481() {
		assertEquals("94104", customers.get(3480).getZIP());
	}

	@Test
	@DisplayName("Record 3481: Phone is 415-398-0787")
	void PhoneOfRecord3481() {
		assertEquals("415-398-0787", customers.get(3480).getPhone());
	}

	@Test
	@DisplayName("Record 3481: Fax is 415-398-6297")
	void FaxOfRecord3481() {
		assertEquals("415-398-6297", customers.get(3480).getFax());
	}

	@Test
	@DisplayName("Record 3481: Email is winford@olecki.com")
	void EmailOfRecord3481() {
		assertEquals("winford@olecki.com", customers.get(3480).getEmail());
	}

	@Test
	@DisplayName("Record 3481: Web is http://www.winfordolecki.com")
	void WebOfRecord3481() {
		assertEquals("http://www.winfordolecki.com", customers.get(3480).getWeb());
	}
}
