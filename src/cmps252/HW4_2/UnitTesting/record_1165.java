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
class Record_1165 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 1165: FirstName is Ingrid")
	void FirstNameOfRecord1165() {
		assertEquals("Ingrid", customers.get(1164).getFirstName());
	}

	@Test
	@DisplayName("Record 1165: LastName is Kordys")
	void LastNameOfRecord1165() {
		assertEquals("Kordys", customers.get(1164).getLastName());
	}

	@Test
	@DisplayName("Record 1165: Company is Bach, Robert H Esq")
	void CompanyOfRecord1165() {
		assertEquals("Bach, Robert H Esq", customers.get(1164).getCompany());
	}

	@Test
	@DisplayName("Record 1165: Address is 6776 Hamilton Blvd")
	void AddressOfRecord1165() {
		assertEquals("6776 Hamilton Blvd", customers.get(1164).getAddress());
	}

	@Test
	@DisplayName("Record 1165: City is Allentown")
	void CityOfRecord1165() {
		assertEquals("Allentown", customers.get(1164).getCity());
	}

	@Test
	@DisplayName("Record 1165: County is Lehigh")
	void CountyOfRecord1165() {
		assertEquals("Lehigh", customers.get(1164).getCounty());
	}

	@Test
	@DisplayName("Record 1165: State is PA")
	void StateOfRecord1165() {
		assertEquals("PA", customers.get(1164).getState());
	}

	@Test
	@DisplayName("Record 1165: ZIP is 18106")
	void ZIPOfRecord1165() {
		assertEquals("18106", customers.get(1164).getZIP());
	}

	@Test
	@DisplayName("Record 1165: Phone is 610-398-8078")
	void PhoneOfRecord1165() {
		assertEquals("610-398-8078", customers.get(1164).getPhone());
	}

	@Test
	@DisplayName("Record 1165: Fax is 610-398-7158")
	void FaxOfRecord1165() {
		assertEquals("610-398-7158", customers.get(1164).getFax());
	}

	@Test
	@DisplayName("Record 1165: Email is ingrid@kordys.com")
	void EmailOfRecord1165() {
		assertEquals("ingrid@kordys.com", customers.get(1164).getEmail());
	}

	@Test
	@DisplayName("Record 1165: Web is http://www.ingridkordys.com")
	void WebOfRecord1165() {
		assertEquals("http://www.ingridkordys.com", customers.get(1164).getWeb());
	}
}
