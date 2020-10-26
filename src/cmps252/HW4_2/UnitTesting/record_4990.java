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

@Tag("25")
class Record_4990 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4990: FirstName is Alba")
	void FirstNameOfRecord4990() {
		assertEquals("Alba", customers.get(4989).getFirstName());
	}

	@Test
	@DisplayName("Record 4990: LastName is Cangemi")
	void LastNameOfRecord4990() {
		assertEquals("Cangemi", customers.get(4989).getLastName());
	}

	@Test
	@DisplayName("Record 4990: Company is Precision Engineered Products")
	void CompanyOfRecord4990() {
		assertEquals("Precision Engineered Products", customers.get(4989).getCompany());
	}

	@Test
	@DisplayName("Record 4990: Address is 7330 N 16th St  #-b206")
	void AddressOfRecord4990() {
		assertEquals("7330 N 16th St  #-b206", customers.get(4989).getAddress());
	}

	@Test
	@DisplayName("Record 4990: City is Phoenix")
	void CityOfRecord4990() {
		assertEquals("Phoenix", customers.get(4989).getCity());
	}

	@Test
	@DisplayName("Record 4990: County is Maricopa")
	void CountyOfRecord4990() {
		assertEquals("Maricopa", customers.get(4989).getCounty());
	}

	@Test
	@DisplayName("Record 4990: State is AZ")
	void StateOfRecord4990() {
		assertEquals("AZ", customers.get(4989).getState());
	}

	@Test
	@DisplayName("Record 4990: ZIP is 85020")
	void ZIPOfRecord4990() {
		assertEquals("85020", customers.get(4989).getZIP());
	}

	@Test
	@DisplayName("Record 4990: Phone is 602-997-4559")
	void PhoneOfRecord4990() {
		assertEquals("602-997-4559", customers.get(4989).getPhone());
	}

	@Test
	@DisplayName("Record 4990: Fax is 602-997-2034")
	void FaxOfRecord4990() {
		assertEquals("602-997-2034", customers.get(4989).getFax());
	}

	@Test
	@DisplayName("Record 4990: Email is alba@cangemi.com")
	void EmailOfRecord4990() {
		assertEquals("alba@cangemi.com", customers.get(4989).getEmail());
	}

	@Test
	@DisplayName("Record 4990: Web is http://www.albacangemi.com")
	void WebOfRecord4990() {
		assertEquals("http://www.albacangemi.com", customers.get(4989).getWeb());
	}
}
