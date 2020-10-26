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

@Tag("13")
class Record_3310 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3310: FirstName is Cole")
	void FirstNameOfRecord3310() {
		assertEquals("Cole", customers.get(3309).getFirstName());
	}

	@Test
	@DisplayName("Record 3310: LastName is Denina")
	void LastNameOfRecord3310() {
		assertEquals("Denina", customers.get(3309).getLastName());
	}

	@Test
	@DisplayName("Record 3310: Company is Keller, Kurt J Esq")
	void CompanyOfRecord3310() {
		assertEquals("Keller, Kurt J Esq", customers.get(3309).getCompany());
	}

	@Test
	@DisplayName("Record 3310: Address is 210 S Anita Ave")
	void AddressOfRecord3310() {
		assertEquals("210 S Anita Ave", customers.get(3309).getAddress());
	}

	@Test
	@DisplayName("Record 3310: City is Los Angeles")
	void CityOfRecord3310() {
		assertEquals("Los Angeles", customers.get(3309).getCity());
	}

	@Test
	@DisplayName("Record 3310: County is Los Angeles")
	void CountyOfRecord3310() {
		assertEquals("Los Angeles", customers.get(3309).getCounty());
	}

	@Test
	@DisplayName("Record 3310: State is CA")
	void StateOfRecord3310() {
		assertEquals("CA", customers.get(3309).getState());
	}

	@Test
	@DisplayName("Record 3310: ZIP is 90049")
	void ZIPOfRecord3310() {
		assertEquals("90049", customers.get(3309).getZIP());
	}

	@Test
	@DisplayName("Record 3310: Phone is 310-478-2257")
	void PhoneOfRecord3310() {
		assertEquals("310-478-2257", customers.get(3309).getPhone());
	}

	@Test
	@DisplayName("Record 3310: Fax is 310-478-2724")
	void FaxOfRecord3310() {
		assertEquals("310-478-2724", customers.get(3309).getFax());
	}

	@Test
	@DisplayName("Record 3310: Email is cole@denina.com")
	void EmailOfRecord3310() {
		assertEquals("cole@denina.com", customers.get(3309).getEmail());
	}

	@Test
	@DisplayName("Record 3310: Web is http://www.coledenina.com")
	void WebOfRecord3310() {
		assertEquals("http://www.coledenina.com", customers.get(3309).getWeb());
	}
}
