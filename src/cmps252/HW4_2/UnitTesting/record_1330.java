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

@Tag("23")
class Record_1330 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1330: FirstName is Kerry")
	void FirstNameOfRecord1330() {
		assertEquals("Kerry", customers.get(1329).getFirstName());
	}

	@Test
	@DisplayName("Record 1330: LastName is Patient")
	void LastNameOfRecord1330() {
		assertEquals("Patient", customers.get(1329).getLastName());
	}

	@Test
	@DisplayName("Record 1330: Company is Saint Marys College")
	void CompanyOfRecord1330() {
		assertEquals("Saint Marys College", customers.get(1329).getCompany());
	}

	@Test
	@DisplayName("Record 1330: Address is 1153 N Us Highway 67")
	void AddressOfRecord1330() {
		assertEquals("1153 N Us Highway 67", customers.get(1329).getAddress());
	}

	@Test
	@DisplayName("Record 1330: City is Florissant")
	void CityOfRecord1330() {
		assertEquals("Florissant", customers.get(1329).getCity());
	}

	@Test
	@DisplayName("Record 1330: County is Saint Louis")
	void CountyOfRecord1330() {
		assertEquals("Saint Louis", customers.get(1329).getCounty());
	}

	@Test
	@DisplayName("Record 1330: State is MO")
	void StateOfRecord1330() {
		assertEquals("MO", customers.get(1329).getState());
	}

	@Test
	@DisplayName("Record 1330: ZIP is 63031")
	void ZIPOfRecord1330() {
		assertEquals("63031", customers.get(1329).getZIP());
	}

	@Test
	@DisplayName("Record 1330: Phone is 314-837-7882")
	void PhoneOfRecord1330() {
		assertEquals("314-837-7882", customers.get(1329).getPhone());
	}

	@Test
	@DisplayName("Record 1330: Fax is 314-837-2084")
	void FaxOfRecord1330() {
		assertEquals("314-837-2084", customers.get(1329).getFax());
	}

	@Test
	@DisplayName("Record 1330: Email is kerry@patient.com")
	void EmailOfRecord1330() {
		assertEquals("kerry@patient.com", customers.get(1329).getEmail());
	}

	@Test
	@DisplayName("Record 1330: Web is http://www.kerrypatient.com")
	void WebOfRecord1330() {
		assertEquals("http://www.kerrypatient.com", customers.get(1329).getWeb());
	}
}
