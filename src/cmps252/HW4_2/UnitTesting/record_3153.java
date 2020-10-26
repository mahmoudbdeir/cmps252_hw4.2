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
class Record_3153 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3153: FirstName is Kirsten")
	void FirstNameOfRecord3153() {
		assertEquals("Kirsten", customers.get(3152).getFirstName());
	}

	@Test
	@DisplayName("Record 3153: LastName is Serdula")
	void LastNameOfRecord3153() {
		assertEquals("Serdula", customers.get(3152).getLastName());
	}

	@Test
	@DisplayName("Record 3153: Company is Eagle Business Machines Inc")
	void CompanyOfRecord3153() {
		assertEquals("Eagle Business Machines Inc", customers.get(3152).getCompany());
	}

	@Test
	@DisplayName("Record 3153: Address is 14 Dennison St")
	void AddressOfRecord3153() {
		assertEquals("14 Dennison St", customers.get(3152).getAddress());
	}

	@Test
	@DisplayName("Record 3153: City is Kingston")
	void CityOfRecord3153() {
		assertEquals("Kingston", customers.get(3152).getCity());
	}

	@Test
	@DisplayName("Record 3153: County is Luzerne")
	void CountyOfRecord3153() {
		assertEquals("Luzerne", customers.get(3152).getCounty());
	}

	@Test
	@DisplayName("Record 3153: State is PA")
	void StateOfRecord3153() {
		assertEquals("PA", customers.get(3152).getState());
	}

	@Test
	@DisplayName("Record 3153: ZIP is 18704")
	void ZIPOfRecord3153() {
		assertEquals("18704", customers.get(3152).getZIP());
	}

	@Test
	@DisplayName("Record 3153: Phone is 570-288-3007")
	void PhoneOfRecord3153() {
		assertEquals("570-288-3007", customers.get(3152).getPhone());
	}

	@Test
	@DisplayName("Record 3153: Fax is 570-288-8329")
	void FaxOfRecord3153() {
		assertEquals("570-288-8329", customers.get(3152).getFax());
	}

	@Test
	@DisplayName("Record 3153: Email is kirsten@serdula.com")
	void EmailOfRecord3153() {
		assertEquals("kirsten@serdula.com", customers.get(3152).getEmail());
	}

	@Test
	@DisplayName("Record 3153: Web is http://www.kirstenserdula.com")
	void WebOfRecord3153() {
		assertEquals("http://www.kirstenserdula.com", customers.get(3152).getWeb());
	}
}
