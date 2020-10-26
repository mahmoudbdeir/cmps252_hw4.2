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

@Tag("42")
class Record_3777 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 3777: FirstName is Harvey")
	void FirstNameOfRecord3777() {
		assertEquals("Harvey", customers.get(3776).getFirstName());
	}

	@Test
	@DisplayName("Record 3777: LastName is Jurasin")
	void LastNameOfRecord3777() {
		assertEquals("Jurasin", customers.get(3776).getLastName());
	}

	@Test
	@DisplayName("Record 3777: Company is Dita Usa Inc")
	void CompanyOfRecord3777() {
		assertEquals("Dita Usa Inc", customers.get(3776).getCompany());
	}

	@Test
	@DisplayName("Record 3777: Address is 2421 Potshop Ln")
	void AddressOfRecord3777() {
		assertEquals("2421 Potshop Ln", customers.get(3776).getAddress());
	}

	@Test
	@DisplayName("Record 3777: City is Norristown")
	void CityOfRecord3777() {
		assertEquals("Norristown", customers.get(3776).getCity());
	}

	@Test
	@DisplayName("Record 3777: County is Montgomery")
	void CountyOfRecord3777() {
		assertEquals("Montgomery", customers.get(3776).getCounty());
	}

	@Test
	@DisplayName("Record 3777: State is PA")
	void StateOfRecord3777() {
		assertEquals("PA", customers.get(3776).getState());
	}

	@Test
	@DisplayName("Record 3777: ZIP is 19403")
	void ZIPOfRecord3777() {
		assertEquals("19403", customers.get(3776).getZIP());
	}

	@Test
	@DisplayName("Record 3777: Phone is 610-539-3924")
	void PhoneOfRecord3777() {
		assertEquals("610-539-3924", customers.get(3776).getPhone());
	}

	@Test
	@DisplayName("Record 3777: Fax is 610-539-7634")
	void FaxOfRecord3777() {
		assertEquals("610-539-7634", customers.get(3776).getFax());
	}

	@Test
	@DisplayName("Record 3777: Email is harvey@jurasin.com")
	void EmailOfRecord3777() {
		assertEquals("harvey@jurasin.com", customers.get(3776).getEmail());
	}

	@Test
	@DisplayName("Record 3777: Web is http://www.harveyjurasin.com")
	void WebOfRecord3777() {
		assertEquals("http://www.harveyjurasin.com", customers.get(3776).getWeb());
	}
}
