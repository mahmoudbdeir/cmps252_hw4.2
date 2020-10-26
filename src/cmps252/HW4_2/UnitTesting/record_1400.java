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

@Tag("8")
class Record_1400 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1400: FirstName is Lyman")
	void FirstNameOfRecord1400() {
		assertEquals("Lyman", customers.get(1399).getFirstName());
	}

	@Test
	@DisplayName("Record 1400: LastName is Maassen")
	void LastNameOfRecord1400() {
		assertEquals("Maassen", customers.get(1399).getLastName());
	}

	@Test
	@DisplayName("Record 1400: Company is Evnen, Robert B Esq")
	void CompanyOfRecord1400() {
		assertEquals("Evnen, Robert B Esq", customers.get(1399).getCompany());
	}

	@Test
	@DisplayName("Record 1400: Address is 106 W Prutsman St")
	void AddressOfRecord1400() {
		assertEquals("106 W Prutsman St", customers.get(1399).getAddress());
	}

	@Test
	@DisplayName("Record 1400: City is Three Rivers")
	void CityOfRecord1400() {
		assertEquals("Three Rivers", customers.get(1399).getCity());
	}

	@Test
	@DisplayName("Record 1400: County is Saint Joseph")
	void CountyOfRecord1400() {
		assertEquals("Saint Joseph", customers.get(1399).getCounty());
	}

	@Test
	@DisplayName("Record 1400: State is MI")
	void StateOfRecord1400() {
		assertEquals("MI", customers.get(1399).getState());
	}

	@Test
	@DisplayName("Record 1400: ZIP is 49093")
	void ZIPOfRecord1400() {
		assertEquals("49093", customers.get(1399).getZIP());
	}

	@Test
	@DisplayName("Record 1400: Phone is 269-273-7021")
	void PhoneOfRecord1400() {
		assertEquals("269-273-7021", customers.get(1399).getPhone());
	}

	@Test
	@DisplayName("Record 1400: Fax is 269-273-5616")
	void FaxOfRecord1400() {
		assertEquals("269-273-5616", customers.get(1399).getFax());
	}

	@Test
	@DisplayName("Record 1400: Email is lyman@maassen.com")
	void EmailOfRecord1400() {
		assertEquals("lyman@maassen.com", customers.get(1399).getEmail());
	}

	@Test
	@DisplayName("Record 1400: Web is http://www.lymanmaassen.com")
	void WebOfRecord1400() {
		assertEquals("http://www.lymanmaassen.com", customers.get(1399).getWeb());
	}
}
