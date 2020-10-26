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

@Tag("16")
class Record_3133 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3133: FirstName is Minnie")
	void FirstNameOfRecord3133() {
		assertEquals("Minnie", customers.get(3132).getFirstName());
	}

	@Test
	@DisplayName("Record 3133: LastName is Trybala")
	void LastNameOfRecord3133() {
		assertEquals("Trybala", customers.get(3132).getLastName());
	}

	@Test
	@DisplayName("Record 3133: Company is Fabacraft")
	void CompanyOfRecord3133() {
		assertEquals("Fabacraft", customers.get(3132).getCompany());
	}

	@Test
	@DisplayName("Record 3133: Address is 1314 Frankford Ave")
	void AddressOfRecord3133() {
		assertEquals("1314 Frankford Ave", customers.get(3132).getAddress());
	}

	@Test
	@DisplayName("Record 3133: City is Philadelphia")
	void CityOfRecord3133() {
		assertEquals("Philadelphia", customers.get(3132).getCity());
	}

	@Test
	@DisplayName("Record 3133: County is Philadelphia")
	void CountyOfRecord3133() {
		assertEquals("Philadelphia", customers.get(3132).getCounty());
	}

	@Test
	@DisplayName("Record 3133: State is PA")
	void StateOfRecord3133() {
		assertEquals("PA", customers.get(3132).getState());
	}

	@Test
	@DisplayName("Record 3133: ZIP is 19125")
	void ZIPOfRecord3133() {
		assertEquals("19125", customers.get(3132).getZIP());
	}

	@Test
	@DisplayName("Record 3133: Phone is 215-426-0303")
	void PhoneOfRecord3133() {
		assertEquals("215-426-0303", customers.get(3132).getPhone());
	}

	@Test
	@DisplayName("Record 3133: Fax is 215-426-9289")
	void FaxOfRecord3133() {
		assertEquals("215-426-9289", customers.get(3132).getFax());
	}

	@Test
	@DisplayName("Record 3133: Email is minnie@trybala.com")
	void EmailOfRecord3133() {
		assertEquals("minnie@trybala.com", customers.get(3132).getEmail());
	}

	@Test
	@DisplayName("Record 3133: Web is http://www.minnietrybala.com")
	void WebOfRecord3133() {
		assertEquals("http://www.minnietrybala.com", customers.get(3132).getWeb());
	}
}
