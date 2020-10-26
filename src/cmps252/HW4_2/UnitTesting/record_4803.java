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

@Tag("34")
class Record_4803 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4803: FirstName is Jeanna")
	void FirstNameOfRecord4803() {
		assertEquals("Jeanna", customers.get(4802).getFirstName());
	}

	@Test
	@DisplayName("Record 4803: LastName is Thackston")
	void LastNameOfRecord4803() {
		assertEquals("Thackston", customers.get(4802).getLastName());
	}

	@Test
	@DisplayName("Record 4803: Company is Lasswell, Gerald D Esq")
	void CompanyOfRecord4803() {
		assertEquals("Lasswell, Gerald D Esq", customers.get(4802).getCompany());
	}

	@Test
	@DisplayName("Record 4803: Address is 205 Rydhurst Ave")
	void AddressOfRecord4803() {
		assertEquals("205 Rydhurst Ave", customers.get(4802).getAddress());
	}

	@Test
	@DisplayName("Record 4803: City is Nashville")
	void CityOfRecord4803() {
		assertEquals("Nashville", customers.get(4802).getCity());
	}

	@Test
	@DisplayName("Record 4803: County is Davidson")
	void CountyOfRecord4803() {
		assertEquals("Davidson", customers.get(4802).getCounty());
	}

	@Test
	@DisplayName("Record 4803: State is TN")
	void StateOfRecord4803() {
		assertEquals("TN", customers.get(4802).getState());
	}

	@Test
	@DisplayName("Record 4803: ZIP is 37203")
	void ZIPOfRecord4803() {
		assertEquals("37203", customers.get(4802).getZIP());
	}

	@Test
	@DisplayName("Record 4803: Phone is 615-329-4570")
	void PhoneOfRecord4803() {
		assertEquals("615-329-4570", customers.get(4802).getPhone());
	}

	@Test
	@DisplayName("Record 4803: Fax is 615-329-2952")
	void FaxOfRecord4803() {
		assertEquals("615-329-2952", customers.get(4802).getFax());
	}

	@Test
	@DisplayName("Record 4803: Email is jeanna@thackston.com")
	void EmailOfRecord4803() {
		assertEquals("jeanna@thackston.com", customers.get(4802).getEmail());
	}

	@Test
	@DisplayName("Record 4803: Web is http://www.jeannathackston.com")
	void WebOfRecord4803() {
		assertEquals("http://www.jeannathackston.com", customers.get(4802).getWeb());
	}
}
