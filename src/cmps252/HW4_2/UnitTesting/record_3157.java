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

@Tag("40")
class Record_3157 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3157: FirstName is Nolan")
	void FirstNameOfRecord3157() {
		assertEquals("Nolan", customers.get(3156).getFirstName());
	}

	@Test
	@DisplayName("Record 3157: LastName is Marina")
	void LastNameOfRecord3157() {
		assertEquals("Marina", customers.get(3156).getLastName());
	}

	@Test
	@DisplayName("Record 3157: Company is Johnson, Florence M Esq")
	void CompanyOfRecord3157() {
		assertEquals("Johnson, Florence M Esq", customers.get(3156).getCompany());
	}

	@Test
	@DisplayName("Record 3157: Address is 6745 Highway 10 Nw")
	void AddressOfRecord3157() {
		assertEquals("6745 Highway 10 Nw", customers.get(3156).getAddress());
	}

	@Test
	@DisplayName("Record 3157: City is Anoka")
	void CityOfRecord3157() {
		assertEquals("Anoka", customers.get(3156).getCity());
	}

	@Test
	@DisplayName("Record 3157: County is Anoka")
	void CountyOfRecord3157() {
		assertEquals("Anoka", customers.get(3156).getCounty());
	}

	@Test
	@DisplayName("Record 3157: State is MN")
	void StateOfRecord3157() {
		assertEquals("MN", customers.get(3156).getState());
	}

	@Test
	@DisplayName("Record 3157: ZIP is 55303")
	void ZIPOfRecord3157() {
		assertEquals("55303", customers.get(3156).getZIP());
	}

	@Test
	@DisplayName("Record 3157: Phone is 763-422-6192")
	void PhoneOfRecord3157() {
		assertEquals("763-422-6192", customers.get(3156).getPhone());
	}

	@Test
	@DisplayName("Record 3157: Fax is 763-422-3437")
	void FaxOfRecord3157() {
		assertEquals("763-422-3437", customers.get(3156).getFax());
	}

	@Test
	@DisplayName("Record 3157: Email is nolan@marina.com")
	void EmailOfRecord3157() {
		assertEquals("nolan@marina.com", customers.get(3156).getEmail());
	}

	@Test
	@DisplayName("Record 3157: Web is http://www.nolanmarina.com")
	void WebOfRecord3157() {
		assertEquals("http://www.nolanmarina.com", customers.get(3156).getWeb());
	}
}
