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

@Tag("10")
class Record_3447 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3447: FirstName is Isidro")
	void FirstNameOfRecord3447() {
		assertEquals("Isidro", customers.get(3446).getFirstName());
	}

	@Test
	@DisplayName("Record 3447: LastName is Churape")
	void LastNameOfRecord3447() {
		assertEquals("Churape", customers.get(3446).getLastName());
	}

	@Test
	@DisplayName("Record 3447: Company is Watson, Wade T Esq")
	void CompanyOfRecord3447() {
		assertEquals("Watson, Wade T Esq", customers.get(3446).getCompany());
	}

	@Test
	@DisplayName("Record 3447: Address is 59 N Main St")
	void AddressOfRecord3447() {
		assertEquals("59 N Main St", customers.get(3446).getAddress());
	}

	@Test
	@DisplayName("Record 3447: City is Barre")
	void CityOfRecord3447() {
		assertEquals("Barre", customers.get(3446).getCity());
	}

	@Test
	@DisplayName("Record 3447: County is Washington")
	void CountyOfRecord3447() {
		assertEquals("Washington", customers.get(3446).getCounty());
	}

	@Test
	@DisplayName("Record 3447: State is VT")
	void StateOfRecord3447() {
		assertEquals("VT", customers.get(3446).getState());
	}

	@Test
	@DisplayName("Record 3447: ZIP is 5641")
	void ZIPOfRecord3447() {
		assertEquals("5641", customers.get(3446).getZIP());
	}

	@Test
	@DisplayName("Record 3447: Phone is 802-476-2943")
	void PhoneOfRecord3447() {
		assertEquals("802-476-2943", customers.get(3446).getPhone());
	}

	@Test
	@DisplayName("Record 3447: Fax is 802-476-4189")
	void FaxOfRecord3447() {
		assertEquals("802-476-4189", customers.get(3446).getFax());
	}

	@Test
	@DisplayName("Record 3447: Email is isidro@churape.com")
	void EmailOfRecord3447() {
		assertEquals("isidro@churape.com", customers.get(3446).getEmail());
	}

	@Test
	@DisplayName("Record 3447: Web is http://www.isidrochurape.com")
	void WebOfRecord3447() {
		assertEquals("http://www.isidrochurape.com", customers.get(3446).getWeb());
	}
}
