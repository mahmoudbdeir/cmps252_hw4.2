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

@Tag("8")
class Record_648 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 648: FirstName is Avis")
	void FirstNameOfRecord648() {
		assertEquals("Avis", customers.get(647).getFirstName());
	}

	@Test
	@DisplayName("Record 648: LastName is Kuamoo")
	void LastNameOfRecord648() {
		assertEquals("Kuamoo", customers.get(647).getLastName());
	}

	@Test
	@DisplayName("Record 648: Company is Swift, Jerry R Esq")
	void CompanyOfRecord648() {
		assertEquals("Swift, Jerry R Esq", customers.get(647).getCompany());
	}

	@Test
	@DisplayName("Record 648: Address is 6787 Oakbrook Blvd")
	void AddressOfRecord648() {
		assertEquals("6787 Oakbrook Blvd", customers.get(647).getAddress());
	}

	@Test
	@DisplayName("Record 648: City is Dallas")
	void CityOfRecord648() {
		assertEquals("Dallas", customers.get(647).getCity());
	}

	@Test
	@DisplayName("Record 648: County is Dallas")
	void CountyOfRecord648() {
		assertEquals("Dallas", customers.get(647).getCounty());
	}

	@Test
	@DisplayName("Record 648: State is TX")
	void StateOfRecord648() {
		assertEquals("TX", customers.get(647).getState());
	}

	@Test
	@DisplayName("Record 648: ZIP is 75235")
	void ZIPOfRecord648() {
		assertEquals("75235", customers.get(647).getZIP());
	}

	@Test
	@DisplayName("Record 648: Phone is 214-905-1718")
	void PhoneOfRecord648() {
		assertEquals("214-905-1718", customers.get(647).getPhone());
	}

	@Test
	@DisplayName("Record 648: Fax is 214-905-9366")
	void FaxOfRecord648() {
		assertEquals("214-905-9366", customers.get(647).getFax());
	}

	@Test
	@DisplayName("Record 648: Email is avis@kuamoo.com")
	void EmailOfRecord648() {
		assertEquals("avis@kuamoo.com", customers.get(647).getEmail());
	}

	@Test
	@DisplayName("Record 648: Web is http://www.aviskuamoo.com")
	void WebOfRecord648() {
		assertEquals("http://www.aviskuamoo.com", customers.get(647).getWeb());
	}
}
