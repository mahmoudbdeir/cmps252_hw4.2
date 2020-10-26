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

@Tag("26")
class Record_3187 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3187: FirstName is Pauline")
	void FirstNameOfRecord3187() {
		assertEquals("Pauline", customers.get(3186).getFirstName());
	}

	@Test
	@DisplayName("Record 3187: LastName is Bekis")
	void LastNameOfRecord3187() {
		assertEquals("Bekis", customers.get(3186).getLastName());
	}

	@Test
	@DisplayName("Record 3187: Company is Bosch, Warren B Esq")
	void CompanyOfRecord3187() {
		assertEquals("Bosch, Warren B Esq", customers.get(3186).getCompany());
	}

	@Test
	@DisplayName("Record 3187: Address is 2551 County Road 10 W")
	void AddressOfRecord3187() {
		assertEquals("2551 County Road 10 W", customers.get(3186).getAddress());
	}

	@Test
	@DisplayName("Record 3187: City is Elkhart")
	void CityOfRecord3187() {
		assertEquals("Elkhart", customers.get(3186).getCity());
	}

	@Test
	@DisplayName("Record 3187: County is Elkhart")
	void CountyOfRecord3187() {
		assertEquals("Elkhart", customers.get(3186).getCounty());
	}

	@Test
	@DisplayName("Record 3187: State is IN")
	void StateOfRecord3187() {
		assertEquals("IN", customers.get(3186).getState());
	}

	@Test
	@DisplayName("Record 3187: ZIP is 46514")
	void ZIPOfRecord3187() {
		assertEquals("46514", customers.get(3186).getZIP());
	}

	@Test
	@DisplayName("Record 3187: Phone is 574-262-0737")
	void PhoneOfRecord3187() {
		assertEquals("574-262-0737", customers.get(3186).getPhone());
	}

	@Test
	@DisplayName("Record 3187: Fax is 574-262-7661")
	void FaxOfRecord3187() {
		assertEquals("574-262-7661", customers.get(3186).getFax());
	}

	@Test
	@DisplayName("Record 3187: Email is pauline@bekis.com")
	void EmailOfRecord3187() {
		assertEquals("pauline@bekis.com", customers.get(3186).getEmail());
	}

	@Test
	@DisplayName("Record 3187: Web is http://www.paulinebekis.com")
	void WebOfRecord3187() {
		assertEquals("http://www.paulinebekis.com", customers.get(3186).getWeb());
	}
}
