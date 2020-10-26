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

@Tag("20")
class Record_2463 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 2463: FirstName is Roseann")
	void FirstNameOfRecord2463() {
		assertEquals("Roseann", customers.get(2462).getFirstName());
	}

	@Test
	@DisplayName("Record 2463: LastName is Kurdziel")
	void LastNameOfRecord2463() {
		assertEquals("Kurdziel", customers.get(2462).getLastName());
	}

	@Test
	@DisplayName("Record 2463: Company is Hennessy Gardner ydson")
	void CompanyOfRecord2463() {
		assertEquals("Hennessy Gardner ydson", customers.get(2462).getCompany());
	}

	@Test
	@DisplayName("Record 2463: Address is 2629 Pleasant Hill Rd")
	void AddressOfRecord2463() {
		assertEquals("2629 Pleasant Hill Rd", customers.get(2462).getAddress());
	}

	@Test
	@DisplayName("Record 2463: City is Pleasant Hill")
	void CityOfRecord2463() {
		assertEquals("Pleasant Hill", customers.get(2462).getCity());
	}

	@Test
	@DisplayName("Record 2463: County is Contra Costa")
	void CountyOfRecord2463() {
		assertEquals("Contra Costa", customers.get(2462).getCounty());
	}

	@Test
	@DisplayName("Record 2463: State is CA")
	void StateOfRecord2463() {
		assertEquals("CA", customers.get(2462).getState());
	}

	@Test
	@DisplayName("Record 2463: ZIP is 94523")
	void ZIPOfRecord2463() {
		assertEquals("94523", customers.get(2462).getZIP());
	}

	@Test
	@DisplayName("Record 2463: Phone is 925-930-4104")
	void PhoneOfRecord2463() {
		assertEquals("925-930-4104", customers.get(2462).getPhone());
	}

	@Test
	@DisplayName("Record 2463: Fax is 925-930-2401")
	void FaxOfRecord2463() {
		assertEquals("925-930-2401", customers.get(2462).getFax());
	}

	@Test
	@DisplayName("Record 2463: Email is roseann@kurdziel.com")
	void EmailOfRecord2463() {
		assertEquals("roseann@kurdziel.com", customers.get(2462).getEmail());
	}

	@Test
	@DisplayName("Record 2463: Web is http://www.roseannkurdziel.com")
	void WebOfRecord2463() {
		assertEquals("http://www.roseannkurdziel.com", customers.get(2462).getWeb());
	}
}
