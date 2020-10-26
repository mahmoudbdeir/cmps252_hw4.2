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

@Tag("32")
class Record_60 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 60: FirstName is Theron")
	void FirstNameOfRecord60() {
		assertEquals("Theron", customers.get(59).getFirstName());
	}

	@Test
	@DisplayName("Record 60: LastName is Bruton")
	void LastNameOfRecord60() {
		assertEquals("Bruton", customers.get(59).getLastName());
	}

	@Test
	@DisplayName("Record 60: Company is C J Scallop Cutting Co Inc")
	void CompanyOfRecord60() {
		assertEquals("C J Scallop Cutting Co Inc", customers.get(59).getCompany());
	}

	@Test
	@DisplayName("Record 60: Address is 10817 Notus Ln  #-a101")
	void AddressOfRecord60() {
		assertEquals("10817 Notus Ln  #-a101", customers.get(59).getAddress());
	}

	@Test
	@DisplayName("Record 60: City is El Paso")
	void CityOfRecord60() {
		assertEquals("El Paso", customers.get(59).getCity());
	}

	@Test
	@DisplayName("Record 60: County is El Paso")
	void CountyOfRecord60() {
		assertEquals("El Paso", customers.get(59).getCounty());
	}

	@Test
	@DisplayName("Record 60: State is TX")
	void StateOfRecord60() {
		assertEquals("TX", customers.get(59).getState());
	}

	@Test
	@DisplayName("Record 60: ZIP is 79935")
	void ZIPOfRecord60() {
		assertEquals("79935", customers.get(59).getZIP());
	}

	@Test
	@DisplayName("Record 60: Phone is 915-590-1805")
	void PhoneOfRecord60() {
		assertEquals("915-590-1805", customers.get(59).getPhone());
	}

	@Test
	@DisplayName("Record 60: Fax is 915-590-7054")
	void FaxOfRecord60() {
		assertEquals("915-590-7054", customers.get(59).getFax());
	}

	@Test
	@DisplayName("Record 60: Email is theron@bruton.com")
	void EmailOfRecord60() {
		assertEquals("theron@bruton.com", customers.get(59).getEmail());
	}

	@Test
	@DisplayName("Record 60: Web is http://www.theronbruton.com")
	void WebOfRecord60() {
		assertEquals("http://www.theronbruton.com", customers.get(59).getWeb());
	}
}
