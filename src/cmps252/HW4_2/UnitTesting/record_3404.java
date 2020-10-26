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

@Tag("29")
class Record_3404 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3404: FirstName is Ola")
	void FirstNameOfRecord3404() {
		assertEquals("Ola", customers.get(3403).getFirstName());
	}

	@Test
	@DisplayName("Record 3404: LastName is Hengst")
	void LastNameOfRecord3404() {
		assertEquals("Hengst", customers.get(3403).getLastName());
	}

	@Test
	@DisplayName("Record 3404: Company is Neeley, David H Esq")
	void CompanyOfRecord3404() {
		assertEquals("Neeley, David H Esq", customers.get(3403).getCompany());
	}

	@Test
	@DisplayName("Record 3404: Address is 650 Geo Washgtn Hwy")
	void AddressOfRecord3404() {
		assertEquals("650 Geo Washgtn Hwy", customers.get(3403).getAddress());
	}

	@Test
	@DisplayName("Record 3404: City is Lincoln")
	void CityOfRecord3404() {
		assertEquals("Lincoln", customers.get(3403).getCity());
	}

	@Test
	@DisplayName("Record 3404: County is Providence")
	void CountyOfRecord3404() {
		assertEquals("Providence", customers.get(3403).getCounty());
	}

	@Test
	@DisplayName("Record 3404: State is RI")
	void StateOfRecord3404() {
		assertEquals("RI", customers.get(3403).getState());
	}

	@Test
	@DisplayName("Record 3404: ZIP is 2865")
	void ZIPOfRecord3404() {
		assertEquals("2865", customers.get(3403).getZIP());
	}

	@Test
	@DisplayName("Record 3404: Phone is 401-333-9115")
	void PhoneOfRecord3404() {
		assertEquals("401-333-9115", customers.get(3403).getPhone());
	}

	@Test
	@DisplayName("Record 3404: Fax is 401-333-8658")
	void FaxOfRecord3404() {
		assertEquals("401-333-8658", customers.get(3403).getFax());
	}

	@Test
	@DisplayName("Record 3404: Email is ola@hengst.com")
	void EmailOfRecord3404() {
		assertEquals("ola@hengst.com", customers.get(3403).getEmail());
	}

	@Test
	@DisplayName("Record 3404: Web is http://www.olahengst.com")
	void WebOfRecord3404() {
		assertEquals("http://www.olahengst.com", customers.get(3403).getWeb());
	}
}
