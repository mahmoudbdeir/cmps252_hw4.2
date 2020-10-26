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
class Record_734 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 734: FirstName is Wilson")
	void FirstNameOfRecord734() {
		assertEquals("Wilson", customers.get(733).getFirstName());
	}

	@Test
	@DisplayName("Record 734: LastName is Taverna")
	void LastNameOfRecord734() {
		assertEquals("Taverna", customers.get(733).getLastName());
	}

	@Test
	@DisplayName("Record 734: Company is Mjb Farming")
	void CompanyOfRecord734() {
		assertEquals("Mjb Farming", customers.get(733).getCompany());
	}

	@Test
	@DisplayName("Record 734: Address is 28752 Marguerite Pky  #-6a")
	void AddressOfRecord734() {
		assertEquals("28752 Marguerite Pky  #-6a", customers.get(733).getAddress());
	}

	@Test
	@DisplayName("Record 734: City is Mission Viejo")
	void CityOfRecord734() {
		assertEquals("Mission Viejo", customers.get(733).getCity());
	}

	@Test
	@DisplayName("Record 734: County is Orange")
	void CountyOfRecord734() {
		assertEquals("Orange", customers.get(733).getCounty());
	}

	@Test
	@DisplayName("Record 734: State is CA")
	void StateOfRecord734() {
		assertEquals("CA", customers.get(733).getState());
	}

	@Test
	@DisplayName("Record 734: ZIP is 92692")
	void ZIPOfRecord734() {
		assertEquals("92692", customers.get(733).getZIP());
	}

	@Test
	@DisplayName("Record 734: Phone is 949-364-5174")
	void PhoneOfRecord734() {
		assertEquals("949-364-5174", customers.get(733).getPhone());
	}

	@Test
	@DisplayName("Record 734: Fax is 949-364-7129")
	void FaxOfRecord734() {
		assertEquals("949-364-7129", customers.get(733).getFax());
	}

	@Test
	@DisplayName("Record 734: Email is wilson@taverna.com")
	void EmailOfRecord734() {
		assertEquals("wilson@taverna.com", customers.get(733).getEmail());
	}

	@Test
	@DisplayName("Record 734: Web is http://www.wilsontaverna.com")
	void WebOfRecord734() {
		assertEquals("http://www.wilsontaverna.com", customers.get(733).getWeb());
	}
}
