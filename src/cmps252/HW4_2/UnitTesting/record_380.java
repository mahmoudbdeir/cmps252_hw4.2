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
class Record_380 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 380: FirstName is Ariel")
	void FirstNameOfRecord380() {
		assertEquals("Ariel", customers.get(379).getFirstName());
	}

	@Test
	@DisplayName("Record 380: LastName is Bozich")
	void LastNameOfRecord380() {
		assertEquals("Bozich", customers.get(379).getLastName());
	}

	@Test
	@DisplayName("Record 380: Company is Neuendorf Systems")
	void CompanyOfRecord380() {
		assertEquals("Neuendorf Systems", customers.get(379).getCompany());
	}

	@Test
	@DisplayName("Record 380: Address is 2709 6th Ave")
	void AddressOfRecord380() {
		assertEquals("2709 6th Ave", customers.get(379).getAddress());
	}

	@Test
	@DisplayName("Record 380: City is Troy")
	void CityOfRecord380() {
		assertEquals("Troy", customers.get(379).getCity());
	}

	@Test
	@DisplayName("Record 380: County is Rensselaer")
	void CountyOfRecord380() {
		assertEquals("Rensselaer", customers.get(379).getCounty());
	}

	@Test
	@DisplayName("Record 380: State is NY")
	void StateOfRecord380() {
		assertEquals("NY", customers.get(379).getState());
	}

	@Test
	@DisplayName("Record 380: ZIP is 12180")
	void ZIPOfRecord380() {
		assertEquals("12180", customers.get(379).getZIP());
	}

	@Test
	@DisplayName("Record 380: Phone is 518-272-0738")
	void PhoneOfRecord380() {
		assertEquals("518-272-0738", customers.get(379).getPhone());
	}

	@Test
	@DisplayName("Record 380: Fax is 518-272-5611")
	void FaxOfRecord380() {
		assertEquals("518-272-5611", customers.get(379).getFax());
	}

	@Test
	@DisplayName("Record 380: Email is ariel@bozich.com")
	void EmailOfRecord380() {
		assertEquals("ariel@bozich.com", customers.get(379).getEmail());
	}

	@Test
	@DisplayName("Record 380: Web is http://www.arielbozich.com")
	void WebOfRecord380() {
		assertEquals("http://www.arielbozich.com", customers.get(379).getWeb());
	}
}
