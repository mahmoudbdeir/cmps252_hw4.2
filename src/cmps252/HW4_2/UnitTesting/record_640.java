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

@Tag("4")
class Record_640 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 640: FirstName is May")
	void FirstNameOfRecord640() {
		assertEquals("May", customers.get(639).getFirstName());
	}

	@Test
	@DisplayName("Record 640: LastName is Belson")
	void LastNameOfRecord640() {
		assertEquals("Belson", customers.get(639).getLastName());
	}

	@Test
	@DisplayName("Record 640: Company is Buchanan, Melanie M Esq")
	void CompanyOfRecord640() {
		assertEquals("Buchanan, Melanie M Esq", customers.get(639).getCompany());
	}

	@Test
	@DisplayName("Record 640: Address is 175 Claiborne St")
	void AddressOfRecord640() {
		assertEquals("175 Claiborne St", customers.get(639).getAddress());
	}

	@Test
	@DisplayName("Record 640: City is Biloxi")
	void CityOfRecord640() {
		assertEquals("Biloxi", customers.get(639).getCity());
	}

	@Test
	@DisplayName("Record 640: County is Harrison")
	void CountyOfRecord640() {
		assertEquals("Harrison", customers.get(639).getCounty());
	}

	@Test
	@DisplayName("Record 640: State is MS")
	void StateOfRecord640() {
		assertEquals("MS", customers.get(639).getState());
	}

	@Test
	@DisplayName("Record 640: ZIP is 39530")
	void ZIPOfRecord640() {
		assertEquals("39530", customers.get(639).getZIP());
	}

	@Test
	@DisplayName("Record 640: Phone is 228-374-6539")
	void PhoneOfRecord640() {
		assertEquals("228-374-6539", customers.get(639).getPhone());
	}

	@Test
	@DisplayName("Record 640: Fax is 228-374-7677")
	void FaxOfRecord640() {
		assertEquals("228-374-7677", customers.get(639).getFax());
	}

	@Test
	@DisplayName("Record 640: Email is may@belson.com")
	void EmailOfRecord640() {
		assertEquals("may@belson.com", customers.get(639).getEmail());
	}

	@Test
	@DisplayName("Record 640: Web is http://www.maybelson.com")
	void WebOfRecord640() {
		assertEquals("http://www.maybelson.com", customers.get(639).getWeb());
	}
}
