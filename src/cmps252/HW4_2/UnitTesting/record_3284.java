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

@Tag("27")
class Record_3284 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3284: FirstName is Alba")
	void FirstNameOfRecord3284() {
		assertEquals("Alba", customers.get(3283).getFirstName());
	}

	@Test
	@DisplayName("Record 3284: LastName is Klipp")
	void LastNameOfRecord3284() {
		assertEquals("Klipp", customers.get(3283).getLastName());
	}

	@Test
	@DisplayName("Record 3284: Company is North La Lgl Asstnce Corp")
	void CompanyOfRecord3284() {
		assertEquals("North La Lgl Asstnce Corp", customers.get(3283).getCompany());
	}

	@Test
	@DisplayName("Record 3284: Address is 1161 Murfreesboro Pike")
	void AddressOfRecord3284() {
		assertEquals("1161 Murfreesboro Pike", customers.get(3283).getAddress());
	}

	@Test
	@DisplayName("Record 3284: City is Nashville")
	void CityOfRecord3284() {
		assertEquals("Nashville", customers.get(3283).getCity());
	}

	@Test
	@DisplayName("Record 3284: County is Davidson")
	void CountyOfRecord3284() {
		assertEquals("Davidson", customers.get(3283).getCounty());
	}

	@Test
	@DisplayName("Record 3284: State is TN")
	void StateOfRecord3284() {
		assertEquals("TN", customers.get(3283).getState());
	}

	@Test
	@DisplayName("Record 3284: ZIP is 37217")
	void ZIPOfRecord3284() {
		assertEquals("37217", customers.get(3283).getZIP());
	}

	@Test
	@DisplayName("Record 3284: Phone is 615-360-3783")
	void PhoneOfRecord3284() {
		assertEquals("615-360-3783", customers.get(3283).getPhone());
	}

	@Test
	@DisplayName("Record 3284: Fax is 615-360-7044")
	void FaxOfRecord3284() {
		assertEquals("615-360-7044", customers.get(3283).getFax());
	}

	@Test
	@DisplayName("Record 3284: Email is alba@klipp.com")
	void EmailOfRecord3284() {
		assertEquals("alba@klipp.com", customers.get(3283).getEmail());
	}

	@Test
	@DisplayName("Record 3284: Web is http://www.albaklipp.com")
	void WebOfRecord3284() {
		assertEquals("http://www.albaklipp.com", customers.get(3283).getWeb());
	}
}
