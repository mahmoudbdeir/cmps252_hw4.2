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
class Record_3683 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3683: FirstName is Ernestine")
	void FirstNameOfRecord3683() {
		assertEquals("Ernestine", customers.get(3682).getFirstName());
	}

	@Test
	@DisplayName("Record 3683: LastName is Medosch")
	void LastNameOfRecord3683() {
		assertEquals("Medosch", customers.get(3682).getLastName());
	}

	@Test
	@DisplayName("Record 3683: Company is Currie Precision Tool Co")
	void CompanyOfRecord3683() {
		assertEquals("Currie Precision Tool Co", customers.get(3682).getCompany());
	}

	@Test
	@DisplayName("Record 3683: Address is 25200 Loytan St")
	void AddressOfRecord3683() {
		assertEquals("25200 Loytan St", customers.get(3682).getAddress());
	}

	@Test
	@DisplayName("Record 3683: City is Torrance")
	void CityOfRecord3683() {
		assertEquals("Torrance", customers.get(3682).getCity());
	}

	@Test
	@DisplayName("Record 3683: County is Los Angeles")
	void CountyOfRecord3683() {
		assertEquals("Los Angeles", customers.get(3682).getCounty());
	}

	@Test
	@DisplayName("Record 3683: State is CA")
	void StateOfRecord3683() {
		assertEquals("CA", customers.get(3682).getState());
	}

	@Test
	@DisplayName("Record 3683: ZIP is 90505")
	void ZIPOfRecord3683() {
		assertEquals("90505", customers.get(3682).getZIP());
	}

	@Test
	@DisplayName("Record 3683: Phone is 310-325-3817")
	void PhoneOfRecord3683() {
		assertEquals("310-325-3817", customers.get(3682).getPhone());
	}

	@Test
	@DisplayName("Record 3683: Fax is 310-325-5425")
	void FaxOfRecord3683() {
		assertEquals("310-325-5425", customers.get(3682).getFax());
	}

	@Test
	@DisplayName("Record 3683: Email is ernestine@medosch.com")
	void EmailOfRecord3683() {
		assertEquals("ernestine@medosch.com", customers.get(3682).getEmail());
	}

	@Test
	@DisplayName("Record 3683: Web is http://www.ernestinemedosch.com")
	void WebOfRecord3683() {
		assertEquals("http://www.ernestinemedosch.com", customers.get(3682).getWeb());
	}
}
