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

@Tag("24")
class Record_618 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 618: FirstName is Ana")
	void FirstNameOfRecord618() {
		assertEquals("Ana", customers.get(617).getFirstName());
	}

	@Test
	@DisplayName("Record 618: LastName is Letofsky")
	void LastNameOfRecord618() {
		assertEquals("Letofsky", customers.get(617).getLastName());
	}

	@Test
	@DisplayName("Record 618: Company is Dillard, Pamela H Esq")
	void CompanyOfRecord618() {
		assertEquals("Dillard, Pamela H Esq", customers.get(617).getCompany());
	}

	@Test
	@DisplayName("Record 618: Address is 12129 Nebel St")
	void AddressOfRecord618() {
		assertEquals("12129 Nebel St", customers.get(617).getAddress());
	}

	@Test
	@DisplayName("Record 618: City is Rockville")
	void CityOfRecord618() {
		assertEquals("Rockville", customers.get(617).getCity());
	}

	@Test
	@DisplayName("Record 618: County is Montgomery")
	void CountyOfRecord618() {
		assertEquals("Montgomery", customers.get(617).getCounty());
	}

	@Test
	@DisplayName("Record 618: State is MD")
	void StateOfRecord618() {
		assertEquals("MD", customers.get(617).getState());
	}

	@Test
	@DisplayName("Record 618: ZIP is 20852")
	void ZIPOfRecord618() {
		assertEquals("20852", customers.get(617).getZIP());
	}

	@Test
	@DisplayName("Record 618: Phone is 301-468-1389")
	void PhoneOfRecord618() {
		assertEquals("301-468-1389", customers.get(617).getPhone());
	}

	@Test
	@DisplayName("Record 618: Fax is 301-468-8489")
	void FaxOfRecord618() {
		assertEquals("301-468-8489", customers.get(617).getFax());
	}

	@Test
	@DisplayName("Record 618: Email is ana@letofsky.com")
	void EmailOfRecord618() {
		assertEquals("ana@letofsky.com", customers.get(617).getEmail());
	}

	@Test
	@DisplayName("Record 618: Web is http://www.analetofsky.com")
	void WebOfRecord618() {
		assertEquals("http://www.analetofsky.com", customers.get(617).getWeb());
	}
}
