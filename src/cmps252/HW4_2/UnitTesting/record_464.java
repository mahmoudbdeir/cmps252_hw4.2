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

@Tag("5")
class Record_464 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 464: FirstName is Ivory")
	void FirstNameOfRecord464() {
		assertEquals("Ivory", customers.get(463).getFirstName());
	}

	@Test
	@DisplayName("Record 464: LastName is Obyrne")
	void LastNameOfRecord464() {
		assertEquals("Obyrne", customers.get(463).getLastName());
	}

	@Test
	@DisplayName("Record 464: Company is Smiths Pianos & Organs")
	void CompanyOfRecord464() {
		assertEquals("Smiths Pianos & Organs", customers.get(463).getCompany());
	}

	@Test
	@DisplayName("Record 464: Address is 12520 Prosperity Dr  #-300")
	void AddressOfRecord464() {
		assertEquals("12520 Prosperity Dr  #-300", customers.get(463).getAddress());
	}

	@Test
	@DisplayName("Record 464: City is Silver Spring")
	void CityOfRecord464() {
		assertEquals("Silver Spring", customers.get(463).getCity());
	}

	@Test
	@DisplayName("Record 464: County is Montgomery")
	void CountyOfRecord464() {
		assertEquals("Montgomery", customers.get(463).getCounty());
	}

	@Test
	@DisplayName("Record 464: State is MD")
	void StateOfRecord464() {
		assertEquals("MD", customers.get(463).getState());
	}

	@Test
	@DisplayName("Record 464: ZIP is 20904")
	void ZIPOfRecord464() {
		assertEquals("20904", customers.get(463).getZIP());
	}

	@Test
	@DisplayName("Record 464: Phone is 301-384-6358")
	void PhoneOfRecord464() {
		assertEquals("301-384-6358", customers.get(463).getPhone());
	}

	@Test
	@DisplayName("Record 464: Fax is 301-384-7675")
	void FaxOfRecord464() {
		assertEquals("301-384-7675", customers.get(463).getFax());
	}

	@Test
	@DisplayName("Record 464: Email is ivory@obyrne.com")
	void EmailOfRecord464() {
		assertEquals("ivory@obyrne.com", customers.get(463).getEmail());
	}

	@Test
	@DisplayName("Record 464: Web is http://www.ivoryobyrne.com")
	void WebOfRecord464() {
		assertEquals("http://www.ivoryobyrne.com", customers.get(463).getWeb());
	}
}
