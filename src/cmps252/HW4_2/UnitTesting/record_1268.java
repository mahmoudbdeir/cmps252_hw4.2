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

@Tag("42")
class Record_1268 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1268: FirstName is Oswaldo")
	void FirstNameOfRecord1268() {
		assertEquals("Oswaldo", customers.get(1267).getFirstName());
	}

	@Test
	@DisplayName("Record 1268: LastName is Musulin")
	void LastNameOfRecord1268() {
		assertEquals("Musulin", customers.get(1267).getLastName());
	}

	@Test
	@DisplayName("Record 1268: Company is Palmetto Wholesale Co")
	void CompanyOfRecord1268() {
		assertEquals("Palmetto Wholesale Co", customers.get(1267).getCompany());
	}

	@Test
	@DisplayName("Record 1268: Address is 1215 E Calaveras Blvd")
	void AddressOfRecord1268() {
		assertEquals("1215 E Calaveras Blvd", customers.get(1267).getAddress());
	}

	@Test
	@DisplayName("Record 1268: City is Milpitas")
	void CityOfRecord1268() {
		assertEquals("Milpitas", customers.get(1267).getCity());
	}

	@Test
	@DisplayName("Record 1268: County is Santa Clara")
	void CountyOfRecord1268() {
		assertEquals("Santa Clara", customers.get(1267).getCounty());
	}

	@Test
	@DisplayName("Record 1268: State is CA")
	void StateOfRecord1268() {
		assertEquals("CA", customers.get(1267).getState());
	}

	@Test
	@DisplayName("Record 1268: ZIP is 95035")
	void ZIPOfRecord1268() {
		assertEquals("95035", customers.get(1267).getZIP());
	}

	@Test
	@DisplayName("Record 1268: Phone is 408-262-6115")
	void PhoneOfRecord1268() {
		assertEquals("408-262-6115", customers.get(1267).getPhone());
	}

	@Test
	@DisplayName("Record 1268: Fax is 408-262-0955")
	void FaxOfRecord1268() {
		assertEquals("408-262-0955", customers.get(1267).getFax());
	}

	@Test
	@DisplayName("Record 1268: Email is oswaldo@musulin.com")
	void EmailOfRecord1268() {
		assertEquals("oswaldo@musulin.com", customers.get(1267).getEmail());
	}

	@Test
	@DisplayName("Record 1268: Web is http://www.oswaldomusulin.com")
	void WebOfRecord1268() {
		assertEquals("http://www.oswaldomusulin.com", customers.get(1267).getWeb());
	}
}
