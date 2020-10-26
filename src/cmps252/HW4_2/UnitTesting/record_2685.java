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

@Tag("7")
class Record_2685 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2685: FirstName is Hai")
	void FirstNameOfRecord2685() {
		assertEquals("Hai", customers.get(2684).getFirstName());
	}

	@Test
	@DisplayName("Record 2685: LastName is Kryzak")
	void LastNameOfRecord2685() {
		assertEquals("Kryzak", customers.get(2684).getLastName());
	}

	@Test
	@DisplayName("Record 2685: Company is Premier Plastics Corp")
	void CompanyOfRecord2685() {
		assertEquals("Premier Plastics Corp", customers.get(2684).getCompany());
	}

	@Test
	@DisplayName("Record 2685: Address is 1920 Fairfax Ave")
	void AddressOfRecord2685() {
		assertEquals("1920 Fairfax Ave", customers.get(2684).getAddress());
	}

	@Test
	@DisplayName("Record 2685: City is Cherry Hill")
	void CityOfRecord2685() {
		assertEquals("Cherry Hill", customers.get(2684).getCity());
	}

	@Test
	@DisplayName("Record 2685: County is Camden")
	void CountyOfRecord2685() {
		assertEquals("Camden", customers.get(2684).getCounty());
	}

	@Test
	@DisplayName("Record 2685: State is NJ")
	void StateOfRecord2685() {
		assertEquals("NJ", customers.get(2684).getState());
	}

	@Test
	@DisplayName("Record 2685: ZIP is 8003")
	void ZIPOfRecord2685() {
		assertEquals("8003", customers.get(2684).getZIP());
	}

	@Test
	@DisplayName("Record 2685: Phone is 856-424-5422")
	void PhoneOfRecord2685() {
		assertEquals("856-424-5422", customers.get(2684).getPhone());
	}

	@Test
	@DisplayName("Record 2685: Fax is 856-424-6228")
	void FaxOfRecord2685() {
		assertEquals("856-424-6228", customers.get(2684).getFax());
	}

	@Test
	@DisplayName("Record 2685: Email is hai@kryzak.com")
	void EmailOfRecord2685() {
		assertEquals("hai@kryzak.com", customers.get(2684).getEmail());
	}

	@Test
	@DisplayName("Record 2685: Web is http://www.haikryzak.com")
	void WebOfRecord2685() {
		assertEquals("http://www.haikryzak.com", customers.get(2684).getWeb());
	}
}
