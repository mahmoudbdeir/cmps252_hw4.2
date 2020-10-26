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

@Tag("28")
class Record_4685 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4685: FirstName is Lourdes")
	void FirstNameOfRecord4685() {
		assertEquals("Lourdes", customers.get(4684).getFirstName());
	}

	@Test
	@DisplayName("Record 4685: LastName is Lyngholm")
	void LastNameOfRecord4685() {
		assertEquals("Lyngholm", customers.get(4684).getLastName());
	}

	@Test
	@DisplayName("Record 4685: Company is Finest Printing Co")
	void CompanyOfRecord4685() {
		assertEquals("Finest Printing Co", customers.get(4684).getCompany());
	}

	@Test
	@DisplayName("Record 4685: Address is 6369 Hook Rd")
	void AddressOfRecord4685() {
		assertEquals("6369 Hook Rd", customers.get(4684).getAddress());
	}

	@Test
	@DisplayName("Record 4685: City is Bayonne")
	void CityOfRecord4685() {
		assertEquals("Bayonne", customers.get(4684).getCity());
	}

	@Test
	@DisplayName("Record 4685: County is Hudson")
	void CountyOfRecord4685() {
		assertEquals("Hudson", customers.get(4684).getCounty());
	}

	@Test
	@DisplayName("Record 4685: State is NJ")
	void StateOfRecord4685() {
		assertEquals("NJ", customers.get(4684).getState());
	}

	@Test
	@DisplayName("Record 4685: ZIP is 7002")
	void ZIPOfRecord4685() {
		assertEquals("7002", customers.get(4684).getZIP());
	}

	@Test
	@DisplayName("Record 4685: Phone is 201-858-9921")
	void PhoneOfRecord4685() {
		assertEquals("201-858-9921", customers.get(4684).getPhone());
	}

	@Test
	@DisplayName("Record 4685: Fax is 201-858-1667")
	void FaxOfRecord4685() {
		assertEquals("201-858-1667", customers.get(4684).getFax());
	}

	@Test
	@DisplayName("Record 4685: Email is lourdes@lyngholm.com")
	void EmailOfRecord4685() {
		assertEquals("lourdes@lyngholm.com", customers.get(4684).getEmail());
	}

	@Test
	@DisplayName("Record 4685: Web is http://www.lourdeslyngholm.com")
	void WebOfRecord4685() {
		assertEquals("http://www.lourdeslyngholm.com", customers.get(4684).getWeb());
	}
}
