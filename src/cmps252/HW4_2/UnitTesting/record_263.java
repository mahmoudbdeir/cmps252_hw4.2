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

@Tag("34")
class Record_263 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 263: FirstName is Dino")
	void FirstNameOfRecord263() {
		assertEquals("Dino", customers.get(262).getFirstName());
	}

	@Test
	@DisplayName("Record 263: LastName is Tesauro")
	void LastNameOfRecord263() {
		assertEquals("Tesauro", customers.get(262).getLastName());
	}

	@Test
	@DisplayName("Record 263: Company is Air Land Sea Transportation")
	void CompanyOfRecord263() {
		assertEquals("Air Land Sea Transportation", customers.get(262).getCompany());
	}

	@Test
	@DisplayName("Record 263: Address is Hwy 114")
	void AddressOfRecord263() {
		assertEquals("Hwy 114", customers.get(262).getAddress());
	}

	@Test
	@DisplayName("Record 263: City is Levelland")
	void CityOfRecord263() {
		assertEquals("Levelland", customers.get(262).getCity());
	}

	@Test
	@DisplayName("Record 263: County is Hockley")
	void CountyOfRecord263() {
		assertEquals("Hockley", customers.get(262).getCounty());
	}

	@Test
	@DisplayName("Record 263: State is TX")
	void StateOfRecord263() {
		assertEquals("TX", customers.get(262).getState());
	}

	@Test
	@DisplayName("Record 263: ZIP is 79336")
	void ZIPOfRecord263() {
		assertEquals("79336", customers.get(262).getZIP());
	}

	@Test
	@DisplayName("Record 263: Phone is 806-894-0366")
	void PhoneOfRecord263() {
		assertEquals("806-894-0366", customers.get(262).getPhone());
	}

	@Test
	@DisplayName("Record 263: Fax is 806-894-0739")
	void FaxOfRecord263() {
		assertEquals("806-894-0739", customers.get(262).getFax());
	}

	@Test
	@DisplayName("Record 263: Email is dino@tesauro.com")
	void EmailOfRecord263() {
		assertEquals("dino@tesauro.com", customers.get(262).getEmail());
	}

	@Test
	@DisplayName("Record 263: Web is http://www.dinotesauro.com")
	void WebOfRecord263() {
		assertEquals("http://www.dinotesauro.com", customers.get(262).getWeb());
	}
}
