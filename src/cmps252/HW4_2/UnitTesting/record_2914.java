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
class Record_2914 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2914: FirstName is Alphonso")
	void FirstNameOfRecord2914() {
		assertEquals("Alphonso", customers.get(2913).getFirstName());
	}

	@Test
	@DisplayName("Record 2914: LastName is Frobish")
	void LastNameOfRecord2914() {
		assertEquals("Frobish", customers.get(2913).getLastName());
	}

	@Test
	@DisplayName("Record 2914: Company is John D Jaquess & Associates")
	void CompanyOfRecord2914() {
		assertEquals("John D Jaquess & Associates", customers.get(2913).getCompany());
	}

	@Test
	@DisplayName("Record 2914: Address is 1300 Bayshore Hwy")
	void AddressOfRecord2914() {
		assertEquals("1300 Bayshore Hwy", customers.get(2913).getAddress());
	}

	@Test
	@DisplayName("Record 2914: City is Burlingame")
	void CityOfRecord2914() {
		assertEquals("Burlingame", customers.get(2913).getCity());
	}

	@Test
	@DisplayName("Record 2914: County is San Mateo")
	void CountyOfRecord2914() {
		assertEquals("San Mateo", customers.get(2913).getCounty());
	}

	@Test
	@DisplayName("Record 2914: State is CA")
	void StateOfRecord2914() {
		assertEquals("CA", customers.get(2913).getState());
	}

	@Test
	@DisplayName("Record 2914: ZIP is 94010")
	void ZIPOfRecord2914() {
		assertEquals("94010", customers.get(2913).getZIP());
	}

	@Test
	@DisplayName("Record 2914: Phone is 650-342-5342")
	void PhoneOfRecord2914() {
		assertEquals("650-342-5342", customers.get(2913).getPhone());
	}

	@Test
	@DisplayName("Record 2914: Fax is 650-342-8627")
	void FaxOfRecord2914() {
		assertEquals("650-342-8627", customers.get(2913).getFax());
	}

	@Test
	@DisplayName("Record 2914: Email is alphonso@frobish.com")
	void EmailOfRecord2914() {
		assertEquals("alphonso@frobish.com", customers.get(2913).getEmail());
	}

	@Test
	@DisplayName("Record 2914: Web is http://www.alphonsofrobish.com")
	void WebOfRecord2914() {
		assertEquals("http://www.alphonsofrobish.com", customers.get(2913).getWeb());
	}
}
