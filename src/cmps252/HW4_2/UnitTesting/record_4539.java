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

@Tag("48")
class Record_4539 {

	private static List<Customer> customers;

	@BeforeAll
	public static void init() throws FileNotFoundException {
		customers = FileParser.getCustomers(Configuration.CSV_File);
	}

	@Test
	@DisplayName("Record 4539: FirstName is Irene")
	void FirstNameOfRecord4539() {
		assertEquals("Irene", customers.get(4538).getFirstName());
	}

	@Test
	@DisplayName("Record 4539: LastName is Falvo")
	void LastNameOfRecord4539() {
		assertEquals("Falvo", customers.get(4538).getLastName());
	}

	@Test
	@DisplayName("Record 4539: Company is Payne, Donna Gooden Esq")
	void CompanyOfRecord4539() {
		assertEquals("Payne, Donna Gooden Esq", customers.get(4538).getCompany());
	}

	@Test
	@DisplayName("Record 4539: Address is 1130 E 5th St")
	void AddressOfRecord4539() {
		assertEquals("1130 E 5th St", customers.get(4538).getAddress());
	}

	@Test
	@DisplayName("Record 4539: City is Los Angeles")
	void CityOfRecord4539() {
		assertEquals("Los Angeles", customers.get(4538).getCity());
	}

	@Test
	@DisplayName("Record 4539: County is Los Angeles")
	void CountyOfRecord4539() {
		assertEquals("Los Angeles", customers.get(4538).getCounty());
	}

	@Test
	@DisplayName("Record 4539: State is CA")
	void StateOfRecord4539() {
		assertEquals("CA", customers.get(4538).getState());
	}

	@Test
	@DisplayName("Record 4539: ZIP is 90013")
	void ZIPOfRecord4539() {
		assertEquals("90013", customers.get(4538).getZIP());
	}

	@Test
	@DisplayName("Record 4539: Phone is 213-680-7241")
	void PhoneOfRecord4539() {
		assertEquals("213-680-7241", customers.get(4538).getPhone());
	}

	@Test
	@DisplayName("Record 4539: Fax is 213-680-6398")
	void FaxOfRecord4539() {
		assertEquals("213-680-6398", customers.get(4538).getFax());
	}

	@Test
	@DisplayName("Record 4539: Email is irene@falvo.com")
	void EmailOfRecord4539() {
		assertEquals("irene@falvo.com", customers.get(4538).getEmail());
	}

	@Test
	@DisplayName("Record 4539: Web is http://www.irenefalvo.com")
	void WebOfRecord4539() {
		assertEquals("http://www.irenefalvo.com", customers.get(4538).getWeb());
	}
}
