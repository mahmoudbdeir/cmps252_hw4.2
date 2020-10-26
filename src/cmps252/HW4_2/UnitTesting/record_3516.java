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

@Tag("25")
class Record_3516 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3516: FirstName is Wendell")
	void FirstNameOfRecord3516() {
		assertEquals("Wendell", customers.get(3515).getFirstName());
	}

	@Test
	@DisplayName("Record 3516: LastName is Half")
	void LastNameOfRecord3516() {
		assertEquals("Half", customers.get(3515).getLastName());
	}

	@Test
	@DisplayName("Record 3516: Company is Sifford Ofc Prod & Intr Dsgn")
	void CompanyOfRecord3516() {
		assertEquals("Sifford Ofc Prod & Intr Dsgn", customers.get(3515).getCompany());
	}

	@Test
	@DisplayName("Record 3516: Address is 1401 Central Ave")
	void AddressOfRecord3516() {
		assertEquals("1401 Central Ave", customers.get(3515).getAddress());
	}

	@Test
	@DisplayName("Record 3516: City is Bettendorf")
	void CityOfRecord3516() {
		assertEquals("Bettendorf", customers.get(3515).getCity());
	}

	@Test
	@DisplayName("Record 3516: County is Scott")
	void CountyOfRecord3516() {
		assertEquals("Scott", customers.get(3515).getCounty());
	}

	@Test
	@DisplayName("Record 3516: State is IA")
	void StateOfRecord3516() {
		assertEquals("IA", customers.get(3515).getState());
	}

	@Test
	@DisplayName("Record 3516: ZIP is 52722")
	void ZIPOfRecord3516() {
		assertEquals("52722", customers.get(3515).getZIP());
	}

	@Test
	@DisplayName("Record 3516: Phone is 563-355-9338")
	void PhoneOfRecord3516() {
		assertEquals("563-355-9338", customers.get(3515).getPhone());
	}

	@Test
	@DisplayName("Record 3516: Fax is 563-355-8124")
	void FaxOfRecord3516() {
		assertEquals("563-355-8124", customers.get(3515).getFax());
	}

	@Test
	@DisplayName("Record 3516: Email is wendell@half.com")
	void EmailOfRecord3516() {
		assertEquals("wendell@half.com", customers.get(3515).getEmail());
	}

	@Test
	@DisplayName("Record 3516: Web is http://www.wendellhalf.com")
	void WebOfRecord3516() {
		assertEquals("http://www.wendellhalf.com", customers.get(3515).getWeb());
	}
}
