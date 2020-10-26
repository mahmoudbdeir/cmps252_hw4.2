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

@Tag("43")
class Record_1237 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1237: FirstName is Ora")
	void FirstNameOfRecord1237() {
		assertEquals("Ora", customers.get(1236).getFirstName());
	}

	@Test
	@DisplayName("Record 1237: LastName is Chaobal")
	void LastNameOfRecord1237() {
		assertEquals("Chaobal", customers.get(1236).getLastName());
	}

	@Test
	@DisplayName("Record 1237: Company is Gentry, William E Esq")
	void CompanyOfRecord1237() {
		assertEquals("Gentry, William E Esq", customers.get(1236).getCompany());
	}

	@Test
	@DisplayName("Record 1237: Address is 43 W South Water Market")
	void AddressOfRecord1237() {
		assertEquals("43 W South Water Market", customers.get(1236).getAddress());
	}

	@Test
	@DisplayName("Record 1237: City is Chicago")
	void CityOfRecord1237() {
		assertEquals("Chicago", customers.get(1236).getCity());
	}

	@Test
	@DisplayName("Record 1237: County is Cook")
	void CountyOfRecord1237() {
		assertEquals("Cook", customers.get(1236).getCounty());
	}

	@Test
	@DisplayName("Record 1237: State is IL")
	void StateOfRecord1237() {
		assertEquals("IL", customers.get(1236).getState());
	}

	@Test
	@DisplayName("Record 1237: ZIP is 60608")
	void ZIPOfRecord1237() {
		assertEquals("60608", customers.get(1236).getZIP());
	}

	@Test
	@DisplayName("Record 1237: Phone is 312-243-8845")
	void PhoneOfRecord1237() {
		assertEquals("312-243-8845", customers.get(1236).getPhone());
	}

	@Test
	@DisplayName("Record 1237: Fax is 312-243-5204")
	void FaxOfRecord1237() {
		assertEquals("312-243-5204", customers.get(1236).getFax());
	}

	@Test
	@DisplayName("Record 1237: Email is ora@chaobal.com")
	void EmailOfRecord1237() {
		assertEquals("ora@chaobal.com", customers.get(1236).getEmail());
	}

	@Test
	@DisplayName("Record 1237: Web is http://www.orachaobal.com")
	void WebOfRecord1237() {
		assertEquals("http://www.orachaobal.com", customers.get(1236).getWeb());
	}
}
