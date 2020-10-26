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

@Tag("11")
class Record_4979 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4979: FirstName is Wilburn")
	void FirstNameOfRecord4979() {
		assertEquals("Wilburn", customers.get(4978).getFirstName());
	}

	@Test
	@DisplayName("Record 4979: LastName is Gundrum")
	void LastNameOfRecord4979() {
		assertEquals("Gundrum", customers.get(4978).getLastName());
	}

	@Test
	@DisplayName("Record 4979: Company is Antoske, Thomas E")
	void CompanyOfRecord4979() {
		assertEquals("Antoske, Thomas E", customers.get(4978).getCompany());
	}

	@Test
	@DisplayName("Record 4979: Address is 935 Main St  #-d1")
	void AddressOfRecord4979() {
		assertEquals("935 Main St  #-d1", customers.get(4978).getAddress());
	}

	@Test
	@DisplayName("Record 4979: City is Safety Harbor")
	void CityOfRecord4979() {
		assertEquals("Safety Harbor", customers.get(4978).getCity());
	}

	@Test
	@DisplayName("Record 4979: County is Pinellas")
	void CountyOfRecord4979() {
		assertEquals("Pinellas", customers.get(4978).getCounty());
	}

	@Test
	@DisplayName("Record 4979: State is FL")
	void StateOfRecord4979() {
		assertEquals("FL", customers.get(4978).getState());
	}

	@Test
	@DisplayName("Record 4979: ZIP is 34695")
	void ZIPOfRecord4979() {
		assertEquals("34695", customers.get(4978).getZIP());
	}

	@Test
	@DisplayName("Record 4979: Phone is 727-724-7367")
	void PhoneOfRecord4979() {
		assertEquals("727-724-7367", customers.get(4978).getPhone());
	}

	@Test
	@DisplayName("Record 4979: Fax is 727-724-6401")
	void FaxOfRecord4979() {
		assertEquals("727-724-6401", customers.get(4978).getFax());
	}

	@Test
	@DisplayName("Record 4979: Email is wilburn@gundrum.com")
	void EmailOfRecord4979() {
		assertEquals("wilburn@gundrum.com", customers.get(4978).getEmail());
	}

	@Test
	@DisplayName("Record 4979: Web is http://www.wilburngundrum.com")
	void WebOfRecord4979() {
		assertEquals("http://www.wilburngundrum.com", customers.get(4978).getWeb());
	}
}
