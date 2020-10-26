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

@Tag("21")
class Record_1162 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1162: FirstName is Laurel")
	void FirstNameOfRecord1162() {
		assertEquals("Laurel", customers.get(1161).getFirstName());
	}

	@Test
	@DisplayName("Record 1162: LastName is Olrich")
	void LastNameOfRecord1162() {
		assertEquals("Olrich", customers.get(1161).getLastName());
	}

	@Test
	@DisplayName("Record 1162: Company is Grunewald, Raymond B Esq")
	void CompanyOfRecord1162() {
		assertEquals("Grunewald, Raymond B Esq", customers.get(1161).getCompany());
	}

	@Test
	@DisplayName("Record 1162: Address is 510 Myrtle Ave")
	void AddressOfRecord1162() {
		assertEquals("510 Myrtle Ave", customers.get(1161).getAddress());
	}

	@Test
	@DisplayName("Record 1162: City is South San Francisco")
	void CityOfRecord1162() {
		assertEquals("South San Francisco", customers.get(1161).getCity());
	}

	@Test
	@DisplayName("Record 1162: County is San Mateo")
	void CountyOfRecord1162() {
		assertEquals("San Mateo", customers.get(1161).getCounty());
	}

	@Test
	@DisplayName("Record 1162: State is CA")
	void StateOfRecord1162() {
		assertEquals("CA", customers.get(1161).getState());
	}

	@Test
	@DisplayName("Record 1162: ZIP is 94080")
	void ZIPOfRecord1162() {
		assertEquals("94080", customers.get(1161).getZIP());
	}

	@Test
	@DisplayName("Record 1162: Phone is 650-871-8346")
	void PhoneOfRecord1162() {
		assertEquals("650-871-8346", customers.get(1161).getPhone());
	}

	@Test
	@DisplayName("Record 1162: Fax is 650-871-2028")
	void FaxOfRecord1162() {
		assertEquals("650-871-2028", customers.get(1161).getFax());
	}

	@Test
	@DisplayName("Record 1162: Email is laurel@olrich.com")
	void EmailOfRecord1162() {
		assertEquals("laurel@olrich.com", customers.get(1161).getEmail());
	}

	@Test
	@DisplayName("Record 1162: Web is http://www.laurelolrich.com")
	void WebOfRecord1162() {
		assertEquals("http://www.laurelolrich.com", customers.get(1161).getWeb());
	}
}
