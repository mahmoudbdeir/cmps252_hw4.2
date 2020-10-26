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

@Tag("18")
class Record_4248 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4248: FirstName is Elliott")
	void FirstNameOfRecord4248() {
		assertEquals("Elliott", customers.get(4247).getFirstName());
	}

	@Test
	@DisplayName("Record 4248: LastName is Warling")
	void LastNameOfRecord4248() {
		assertEquals("Warling", customers.get(4247).getLastName());
	}

	@Test
	@DisplayName("Record 4248: Company is Certilman, Morton L Esq")
	void CompanyOfRecord4248() {
		assertEquals("Certilman, Morton L Esq", customers.get(4247).getCompany());
	}

	@Test
	@DisplayName("Record 4248: Address is 3826 I 55n N")
	void AddressOfRecord4248() {
		assertEquals("3826 I 55n N", customers.get(4247).getAddress());
	}

	@Test
	@DisplayName("Record 4248: City is Jackson")
	void CityOfRecord4248() {
		assertEquals("Jackson", customers.get(4247).getCity());
	}

	@Test
	@DisplayName("Record 4248: County is Hinds")
	void CountyOfRecord4248() {
		assertEquals("Hinds", customers.get(4247).getCounty());
	}

	@Test
	@DisplayName("Record 4248: State is MS")
	void StateOfRecord4248() {
		assertEquals("MS", customers.get(4247).getState());
	}

	@Test
	@DisplayName("Record 4248: ZIP is 39211")
	void ZIPOfRecord4248() {
		assertEquals("39211", customers.get(4247).getZIP());
	}

	@Test
	@DisplayName("Record 4248: Phone is 601-982-0816")
	void PhoneOfRecord4248() {
		assertEquals("601-982-0816", customers.get(4247).getPhone());
	}

	@Test
	@DisplayName("Record 4248: Fax is 601-982-3869")
	void FaxOfRecord4248() {
		assertEquals("601-982-3869", customers.get(4247).getFax());
	}

	@Test
	@DisplayName("Record 4248: Email is elliott@warling.com")
	void EmailOfRecord4248() {
		assertEquals("elliott@warling.com", customers.get(4247).getEmail());
	}

	@Test
	@DisplayName("Record 4248: Web is http://www.elliottwarling.com")
	void WebOfRecord4248() {
		assertEquals("http://www.elliottwarling.com", customers.get(4247).getWeb());
	}
}
