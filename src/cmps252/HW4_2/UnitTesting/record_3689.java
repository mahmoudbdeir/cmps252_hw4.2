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

@Tag("3")
class Record_3689 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3689: FirstName is Lucas")
	void FirstNameOfRecord3689() {
		assertEquals("Lucas", customers.get(3688).getFirstName());
	}

	@Test
	@DisplayName("Record 3689: LastName is Monios")
	void LastNameOfRecord3689() {
		assertEquals("Monios", customers.get(3688).getLastName());
	}

	@Test
	@DisplayName("Record 3689: Company is Mata, Luis Esq")
	void CompanyOfRecord3689() {
		assertEquals("Mata, Luis Esq", customers.get(3688).getCompany());
	}

	@Test
	@DisplayName("Record 3689: Address is 88 N Main St")
	void AddressOfRecord3689() {
		assertEquals("88 N Main St", customers.get(3688).getAddress());
	}

	@Test
	@DisplayName("Record 3689: City is Kalispell")
	void CityOfRecord3689() {
		assertEquals("Kalispell", customers.get(3688).getCity());
	}

	@Test
	@DisplayName("Record 3689: County is Flathead")
	void CountyOfRecord3689() {
		assertEquals("Flathead", customers.get(3688).getCounty());
	}

	@Test
	@DisplayName("Record 3689: State is MT")
	void StateOfRecord3689() {
		assertEquals("MT", customers.get(3688).getState());
	}

	@Test
	@DisplayName("Record 3689: ZIP is 59901")
	void ZIPOfRecord3689() {
		assertEquals("59901", customers.get(3688).getZIP());
	}

	@Test
	@DisplayName("Record 3689: Phone is 406-752-6897")
	void PhoneOfRecord3689() {
		assertEquals("406-752-6897", customers.get(3688).getPhone());
	}

	@Test
	@DisplayName("Record 3689: Fax is 406-752-1147")
	void FaxOfRecord3689() {
		assertEquals("406-752-1147", customers.get(3688).getFax());
	}

	@Test
	@DisplayName("Record 3689: Email is lucas@monios.com")
	void EmailOfRecord3689() {
		assertEquals("lucas@monios.com", customers.get(3688).getEmail());
	}

	@Test
	@DisplayName("Record 3689: Web is http://www.lucasmonios.com")
	void WebOfRecord3689() {
		assertEquals("http://www.lucasmonios.com", customers.get(3688).getWeb());
	}
}
