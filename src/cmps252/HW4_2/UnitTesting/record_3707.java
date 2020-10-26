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
class Record_3707 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3707: FirstName is Kathy")
	void FirstNameOfRecord3707() {
		assertEquals("Kathy", customers.get(3706).getFirstName());
	}

	@Test
	@DisplayName("Record 3707: LastName is Forbes")
	void LastNameOfRecord3707() {
		assertEquals("Forbes", customers.get(3706).getLastName());
	}

	@Test
	@DisplayName("Record 3707: Company is John Fs Cafe")
	void CompanyOfRecord3707() {
		assertEquals("John Fs Cafe", customers.get(3706).getCompany());
	}

	@Test
	@DisplayName("Record 3707: Address is 116 Shakespeare Ave")
	void AddressOfRecord3707() {
		assertEquals("116 Shakespeare Ave", customers.get(3706).getAddress());
	}

	@Test
	@DisplayName("Record 3707: City is Madison")
	void CityOfRecord3707() {
		assertEquals("Madison", customers.get(3706).getCity());
	}

	@Test
	@DisplayName("Record 3707: County is Davidson")
	void CountyOfRecord3707() {
		assertEquals("Davidson", customers.get(3706).getCounty());
	}

	@Test
	@DisplayName("Record 3707: State is TN")
	void StateOfRecord3707() {
		assertEquals("TN", customers.get(3706).getState());
	}

	@Test
	@DisplayName("Record 3707: ZIP is 37115")
	void ZIPOfRecord3707() {
		assertEquals("37115", customers.get(3706).getZIP());
	}

	@Test
	@DisplayName("Record 3707: Phone is 615-865-5205")
	void PhoneOfRecord3707() {
		assertEquals("615-865-5205", customers.get(3706).getPhone());
	}

	@Test
	@DisplayName("Record 3707: Fax is 615-865-3583")
	void FaxOfRecord3707() {
		assertEquals("615-865-3583", customers.get(3706).getFax());
	}

	@Test
	@DisplayName("Record 3707: Email is kathy@forbes.com")
	void EmailOfRecord3707() {
		assertEquals("kathy@forbes.com", customers.get(3706).getEmail());
	}

	@Test
	@DisplayName("Record 3707: Web is http://www.kathyforbes.com")
	void WebOfRecord3707() {
		assertEquals("http://www.kathyforbes.com", customers.get(3706).getWeb());
	}
}
